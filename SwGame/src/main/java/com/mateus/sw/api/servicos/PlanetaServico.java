package com.mateus.sw.api.servicos;

import java.util.List;

import com.mateus.sw.api.modelo.Planeta;

public interface PlanetaServico {

	Planeta AdicionarPlaneta(Planeta planeta);

	List<Planeta> listarTodosPlanetas();

	Planeta listaPlanetasNome(String nome);

	Planeta listarPlanetaId(String id);

	void remover(String id);

}
