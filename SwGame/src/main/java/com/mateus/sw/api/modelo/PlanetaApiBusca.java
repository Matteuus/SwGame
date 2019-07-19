package com.mateus.sw.api.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetaApiBusca {

	@JsonProperty("count")
	private int contagem;

	@JsonProperty("results")
	private PlanetaApi[] resutados;

	public int getContagem() {
		return contagem;
	}

	public void setContagem(int contagem) {
		this.contagem = contagem;
	}

	public PlanetaApi[] getResutados() {
		return resutados;
	}

	public void setResutados(PlanetaApi[] resutados) {
		this.resutados = resutados;
	}

}
