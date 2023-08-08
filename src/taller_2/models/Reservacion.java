package taller_2.models;

import java.util.UUID;

public class Reservacion {
	
	//nombre hotel

	private Cliente cliente;
	private Habitacion habitacion;
	private Hotel hotel;

	public Reservacion() {
		super();
	}

	public Reservacion(Cliente cliente, Habitacion habitacion) {
		super();
		this.cliente = cliente;
		this.habitacion = habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	@Override
	public String toString() {
		return "Reservacion []";
	}

}
