package com.mateus.sw.api.servicos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateus.sw.api.modelo.Planeta;
import com.mateus.sw.api.repositorios.PlanetaRepositorio;
import com.mateus.sw.api.servicos.PlanetaServico;

@Service
public class PlanetaServicoImpl implements PlanetaServico {

	@Autowired
	private PlanetaRepositorio planetaRepositorio;

	@Autowired
	PlanetaApiServico PlanetaApiServico;

	@Override
	public Planeta AdicionarPlaneta(Planeta planeta) {
		return this.planetaRepositorio.save(planeta);
	}

	@Override
	public List<Planeta> listarTodosPlanetas() {
		List<Planeta> planetas = this.planetaRepositorio.findAll();
		for (Planeta planeta : planetas) {
			int aparicoes = PlanetaApiServico.aparicoesPlaneta(planeta.getNome());
			planeta.setAparicoes(aparicoes);
		}
		return planetas;
	}

	@Override
	public Planeta listaPlanetasNome(String nome) {
		List<Planeta> planetas = this.planetaRepositorio.findByNome(nome);
		Planeta planeta = planetas.get(0);
		int aparicoes = PlanetaApiServico.aparicoesPlaneta(planeta.getNome());
		planeta.setAparicoes(aparicoes);

		return planeta;
	}

	@Override
	public Planeta listarPlanetaId(String id) {

		Planeta planeta = this.planetaRepositorio.findOne(id);
		int aparicoes = PlanetaApiServico.aparicoesPlaneta(planeta.getNome());
		planeta.setAparicoes(aparicoes);
		return planeta;
	}

	@Override
	public void remover(String id) {
		this.planetaRepositorio.delete(id);

	}

}
