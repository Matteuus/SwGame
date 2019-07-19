package com.mateus.sw.api.servicos.impl;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mateus.sw.api.modelo.PlanetaApi;
import com.mateus.sw.api.modelo.PlanetaApiBusca;

@Component
public class PlanetaApiServico {

	public int aparicoesPlaneta(String nomePlaneta) {

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		String url = "https://swapi.co/api/planets/?format=json&search=" + nomePlaneta;

		ResponseEntity<PlanetaApiBusca> planetaApiBusca = restTemplate.exchange(url, HttpMethod.GET, entity,
				PlanetaApiBusca.class);

		for (PlanetaApi planetaApi : planetaApiBusca.getBody().getResutados()) {
			if (nomePlaneta.equals(planetaApi.getNome())) {
				return planetaApi.getFilmes().size();
			}
		}
		return 0;
	}

}
