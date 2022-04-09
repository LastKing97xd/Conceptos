package com.dhakares.conceptos.app.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tiempos")//es la coleccion tipo una tabla sql
public class Tiempo {

	@Id
	private String id;
	private String nombre;
	private String hora;
	private String momento;
	private String respuesta;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getMomento() {
		return momento;
	}
	public void setMomento(String momento) {
		this.momento = momento;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Tiempo(String nombre, String hora) {
		
		this.nombre = nombre;
		this.hora = hora;
	}
	public Tiempo() {
		
	}
	
	
}
