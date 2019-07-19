package com.mateus.sw.api.respostas;

import java.util.List;

public class Resposta<T> {

	private T dados;
	private List<String> erros;

	public Resposta(T dados) {
		this.dados = dados;
	}

	public Resposta(List<String> erros) {
		this.erros = erros;
	}

	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

}
