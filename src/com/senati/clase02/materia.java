package com.senati.clase02;

public class materia extends Especialidad{

	String nombre;
	int NroHoras;
	public materia(String idEspecialidad, String nombre) {
		super(idEspecialidad, nombre);
	}
	public materia(String idEspecialidad, String nombre, String nombre2, int nroHoras) {
		super(idEspecialidad, nombre);
		nombre = nombre2;
		NroHoras = nroHoras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroHoras() {
		return NroHoras;
	}
	public void setNroHoras(int nroHoras) {
		NroHoras = nroHoras;
	}
	@Override
	public String toString() {
		return "materia [nombre=" + nombre + ", idEspecialidad=" + idEspecialidad + ", Nombre=" + Nombre + "]";
	}
	
}
