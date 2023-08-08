package taller_2.models;

import java.util.List;

public class Alumno {

	private String nombre;
	private String edad;
	private List<Double> calificaciones;

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String edad, List<Double> calificaciones) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.calificaciones = calificaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public List<Double> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Double> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", calificaciones=" + calificaciones + "]";
	}
	
	

}
