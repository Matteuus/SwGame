package com.mateus.sw.api.controle;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateus.sw.api.modelo.Planeta;
import com.mateus.sw.api.respostas.Resposta;
import com.mateus.sw.api.servicos.PlanetaServico;

@RestController
@RequestMapping(path = "/sw/planetas")
public class PlanetaControle {

	@Autowired
	private PlanetaServico planetaServico;

	@PostMapping
	public ResponseEntity<Resposta<Planeta>> AdicionarPlaneta(@Valid @RequestBody Planeta planeta,
			BindingResult resultado) {
		if (resultado.hasErrors()) {
			ArrayList<String> erros = new ArrayList<>();
			resultado.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Resposta<Planeta>(erros));
		}
		return ResponseEntity.ok(new Resposta<Planeta>(this.planetaServico.AdicionarPlaneta(planeta)));
	}

	@GetMapping
	public ResponseEntity<Resposta<List<Planeta>>> listarTodosPlanetas() {
		return ResponseEntity.ok(new Resposta<List<Planeta>>(this.planetaServico.listarTodosPlanetas()));
	}

	@GetMapping(path = "/nome/{nome}")
	public ResponseEntity<Resposta<Planeta>> listarPlanetaNome(
			@PathVariable(name = "nome", required = true) String nome) {
		return ResponseEntity.ok(new Resposta<Planeta>(this.planetaServico.listaPlanetasNome(nome)));
	}

	@GetMapping(path = "/id/{id}")
	public ResponseEntity<Resposta<Planeta>> listarPlanetaId(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Resposta<Planeta>(this.planetaServico.listarPlanetaId(id)));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Resposta<Integer>> remover(@PathVariable(name = "id") String id) {
		this.planetaServico.remover(id);
		return ResponseEntity.ok(new Resposta<Integer>(1));
	}

}
