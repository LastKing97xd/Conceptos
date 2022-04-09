package com.dhakares.conceptos.app.services;

import java.util.List;
import java.util.Optional;

import com.dhakares.conceptos.app.documents.Tiempo;

public interface TiempoService {

	public List<Tiempo> findAll ();
	
	public Optional<Tiempo> findById(String id);
	
	public void save(Tiempo tiempo);
	
	public void delete(Tiempo tiempo);
	
}
