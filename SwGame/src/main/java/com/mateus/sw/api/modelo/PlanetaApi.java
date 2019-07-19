package com.mateus.sw.api.modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetaApi {

	@JsonProperty("name")
	private String nome;

	@JsonProperty("rotation_period")
	private String periodoRotacao;

	@JsonProperty("orbital_period")
	private String periodoOrbital;

	@JsonProperty("diameter")
	private String diametro;

	@JsonProperty("climate")
	private String clima;

	@JsonProperty("gravity")
	private String gravidade;

	@JsonProperty("terrain")
	private String terreno;

	@JsonProperty("surface_water")
	private String aguaSuperficie;

	@JsonProperty("population")
	private String populacao;

	@JsonProperty("residents")
	private List<String> residentes;

	@JsonProperty("films")
	private List<String> filmes;

	@JsonProperty("created")
	private String criado;

	@JsonProperty("edited")
	private String editado;

	@JsonProperty("url")
	private String url;

	public PlanetaApi() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodoRotacao() {
		return periodoRotacao;
	}

	public void setPeriodoRotacao(String periodoRotacao) {
		this.periodoRotacao = periodoRotacao;
	}

	public String getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(String periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getGravidade() {
		return gravidade;
	}

	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public String getAguaSuperficie() {
		return aguaSuperficie;
	}

	public void setAguaSuperficie(String aguaSuperficie) {
		this.aguaSuperficie = aguaSuperficie;
	}

	public String getPopulacao() {
		return populacao;
	}

	public void setPopulacao(String populacao) {
		this.populacao = populacao;
	}

	public List<String> getResidentes() {
		return residentes;
	}

	public void setResidentes(List<String> residentes) {
		this.residentes = residentes;
	}

	public List<String> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<String> filmes) {
		this.filmes = filmes;
	}

	public String getCriado() {
		return criado;
	}

	public void setCriado(String criado) {
		this.criado = criado;
	}

	public String getEditado() {
		return editado;
	}

	public void setEditado(String editado) {
		this.editado = editado;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
