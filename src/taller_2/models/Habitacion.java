package taller_2.models;

import java.util.List;

public class Habitacion {

	private String numero;
	private boolean disponible = true;

	public Habitacion() {
		super();
	}

	public Habitacion(String numero, boolean disponible) {
		super();
		this.numero = numero;
		this.disponible = disponible;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	

}
