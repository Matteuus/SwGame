package com.mateus.sw.api.repositorios;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mateus.sw.api.modelo.Planeta;

public interface PlanetaRepositorio extends MongoRepository<Planeta, String> {

	List<Planeta> findByNome(@Param("nome") String nome);

}
