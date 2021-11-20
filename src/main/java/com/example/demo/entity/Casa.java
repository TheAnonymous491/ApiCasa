package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tb_casas")

public class Casa {
	
	@Id
	@Column(name = "id_casa")
	private int idCasa;
	
	public int getIdCasa() {
		return idCasa;
	}

	public void setIdCasa(int idCasa) {
		this.idCasa = idCasa;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public int getNumhabitacion() {
		return Numhabitacion;
	}

	public void setNumhabitacion(int numhabitacion) {
		Numhabitacion = numhabitacion;
	}

	public int getDimension() {
		return Dimension;
	}

	public void setDimension(int dimension) {
		Dimension = dimension;
	}

	@Column(name = "direccion")
	private String Direccion;

	@Column(name = "precio")
	private int Precio;

	@Column(name = "n_habitaciones")
	private int Numhabitacion;
	
	@Column(name = "dimension")
	private int Dimension;
	

}
