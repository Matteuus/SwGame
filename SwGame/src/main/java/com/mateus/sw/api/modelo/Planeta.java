package com.mateus.sw.api.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.hibernate.validator.constraints.NotEmpty;

@Document
public class Planeta {

	@Id
	private String id;

	@Indexed(unique = true)
	@NotEmpty(message = "O nome do planeta nao pode ficar vazio")
	private String nome;

	@NotEmpty(message = "O clima do planeta nao pode ficar vazio")
	private String clima;

	@NotEmpty(message = "O terreno do planeta nao pode ficar vazio")
	private String terreno;

	@Transient
	private int aparicoes;

	public Planeta() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public int getAparicoes() {
		return aparicoes;
	}

	public void setAparicoes(int aparicoes) {
		this.aparicoes = aparicoes;
	}

}
