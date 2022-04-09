package com.dhakares.conceptos.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dhakares.conceptos.app.documents.Tiempo;

public interface TiempoDao extends MongoRepository<Tiempo, String> {
	
	

}
