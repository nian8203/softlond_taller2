package taller_2.models;

import java.util.List;

public class Cliente {

	private String cliente;
	private String cedula;

	public Cliente() {
		super();
	}

	public Cliente(String cliente, String cedula) {
		super();
		this.cliente = cliente;
		this.cedula = cedula;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Cliente [cliente=" + cliente + ", cedula=" + cedula + "]";
	}

}
