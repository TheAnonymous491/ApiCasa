package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Casa;
import com.example.demo.service.ICasaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api")

public class CasaController {
	
	@Autowired
	private ICasaService serviceCasa;
	
	@GetMapping("/casas")
	public List<Casa> mostrarTodos(){
		return serviceCasa.consultarLista();
	}
	
	@PostMapping("/casas")
	public Casa insertar(@RequestBody Casa obj){
		serviceCasa.insertarCasa(obj);
		return obj;
	}
	
	@DeleteMapping("/casas/{id}")
	public String eliminar(@PathVariable("id") int idCasa){
		serviceCasa.eliminarCasa(idCasa);
		return "El registro ha sido eliminado";
	}
	
	@PutMapping("/casas/{id}")
	public Casa actualizar(@RequestBody Casa obj,@PathVariable("id") int idCasa){
		serviceCasa.actualizarCasa(obj, idCasa);
		return obj;
	}

}
