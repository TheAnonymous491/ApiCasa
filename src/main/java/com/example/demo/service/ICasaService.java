package com.example.demo.service;

import com.example.demo.entity.Casa;

import java.util.List;

public interface ICasaService {
	
	public List<Casa> consultarLista();   
	public void actualizarCasa(Casa obj, int idCasa);
	public void insertarCasa(Casa obj);	
	public void eliminarCasa(int idCasa);

}
