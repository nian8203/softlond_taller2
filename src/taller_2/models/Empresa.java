package taller_2.models;

import java.util.List;

public class Empresa {

	private String nombre;
	private List<Cliente> clientes;

	public Empresa() {
		super();
	}

	public Empresa(String nombre, List<Cliente> clientes) {
		super();
		this.nombre = nombre;
		this.clientes = clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", clientes=" + clientes + "]";
	}

}
