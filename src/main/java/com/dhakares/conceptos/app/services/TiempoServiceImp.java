package com.dhakares.conceptos.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakares.conceptos.app.dao.TiempoDao;
import com.dhakares.conceptos.app.documents.Tiempo;


@Service
public class TiempoServiceImp implements TiempoService{

	@Autowired
	private TiempoDao tiempoDao;
	
	@Override
	public List<Tiempo> findAll() {
		return tiempoDao.findAll();
	}

	@Override
	public Optional<Tiempo> findById(String id) {	
		return tiempoDao.findById(id);
	}

	@Override
	public void save(Tiempo tiempo) {
		
		tiempoDao.save(tiempo);
	}

	@Override
	public void delete(Tiempo tiempo) {
		
		tiempoDao.delete(tiempo);
	}
	
	

}
