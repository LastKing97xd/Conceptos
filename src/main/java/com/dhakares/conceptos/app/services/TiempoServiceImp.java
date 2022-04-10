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
		
		String momento;
		String nombre=tiempo.getNombre();

		String hora=tiempo.getHora();
		
		Integer phora=Integer.parseInt(hora.split(":")[0]);
		Integer pminuto=Integer.parseInt(hora.split(":")[1]);
		
		if(phora<12) {
			momento="dias";
			
		}else if(phora>=12 && phora<18) {
			momento="tardes";
		}else if(phora == 18) {
			if(pminuto<30) {
				momento= "tardes";
			}else {
				momento="noches";
			}
		}else {
			momento="noches";
		}
		
		tiempo.setMomento(momento);
		tiempo.setRespuesta("Buenas "+momento+" "+nombre+", que lo pases excelente :D");
		tiempoDao.save(tiempo);
	}

	@Override
	public void delete(Tiempo tiempo) {
		
		tiempoDao.delete(tiempo);
	}
	
	

}
