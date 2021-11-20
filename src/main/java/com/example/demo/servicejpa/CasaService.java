package com.example.demo.servicejpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Casa;
import com.example.demo.repository.ICasaRepository;
import com.example.demo.service.ICasaService;

@Service
public class CasaService implements ICasaService{
	
	@Autowired
	private ICasaRepository repoCasa;

	@Override
	public List<Casa> consultarLista() {
		return repoCasa.findAll();
	}

	@Override
	public void actualizarCasa(Casa obj, int idCasa) {
		obj.setIdCasa(idCasa);
		repoCasa.save(obj);
		
	}

	@Override
	public void insertarCasa(Casa obj) {
		repoCasa.save(obj);
		
	}

	@Override
	public void eliminarCasa(int idCasa) {
		repoCasa.deleteById(idCasa);
		
	}

}
