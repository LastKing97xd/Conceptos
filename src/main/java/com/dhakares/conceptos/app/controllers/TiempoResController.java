package com.dhakares.conceptos.app.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dhakares.conceptos.app.documents.Tiempo;
import com.dhakares.conceptos.app.services.TiempoService;

@RestController
@RequestMapping("/api/tiempo")
public class TiempoResController {

	@Autowired
	private TiempoService tiempoService;
	
	
	@GetMapping()
	public ResponseEntity<List<Tiempo>>  index(){
		
		List<Tiempo> lista= tiempoService.findAll();
		
		return new ResponseEntity<List<Tiempo>>(lista,HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?>  save(@RequestBody Tiempo tiempo){
		
		tiempoService.save(tiempo);
		
		return new ResponseEntity("Guardado",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Tiempo>> indexe(@PathVariable String id){
		
		Optional<Tiempo> buscar=tiempoService.findById(id);
		
		return new ResponseEntity<Optional<Tiempo>>(buscar,HttpStatus.OK);
		
	}
	
	//si no retorna nada es un requestbody y si regresa es un pathvariable
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete (@RequestBody Tiempo id){
		
		tiempoService.delete(id);
		
		return new ResponseEntity("Borrado",HttpStatus.OK);
	}

}
