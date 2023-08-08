package taller_2.models;

import java.util.Set;

public class Hotel {

	private String nombre;
	private Set<Habitacion> habitaciones;

//	private Set<Reservacion> reservaciones;
	public Hotel() {
		super();
	}

	public Hotel(String nombre, Set<Habitacion> habitaciones) {
		super();
		this.nombre = nombre;
		this.habitaciones = habitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Set<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", habitaciones=" + habitaciones + "]";
	}

}
