package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import taller_2.models.Cliente;

public class OperacionCliente {

	private final Cliente cliente;
	private List<Cliente> clientes = new ArrayList<>();

	public OperacionCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public OperacionCliente() {
		this.cliente = new Cliente(null, null);
	}

	public void solicitarDatosCliente() {
		int opcion;
		
		do {			
			opcion = JOptionPane.showConfirmDialog(null, "¿Desea crear un nuevo cliente?", "Crear Cliente",
					JOptionPane.YES_NO_OPTION);
			
			if (opcion == JOptionPane.YES_OPTION) {
				String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
				String cedula = JOptionPane.showInputDialog(null, "Ingrese numero de cedula");
				
				crearCliente(nombre, cedula);
			}
		} while (opcion == JOptionPane.YES_OPTION);
		
	}

	public Cliente crearCliente(String nombre, String cedula) {
		System.out.println(nombre+"  "+cedula);
		Cliente nuevo = new Cliente(nombre, cedula);
		System.out.println("cliente nuevo; "+nuevo.toString());
		clientes.add(nuevo);
		cliente.toString();
		clientes.forEach(c -> System.out.println("clientes list = "+c.toString()));
		return cliente;

	}
}
