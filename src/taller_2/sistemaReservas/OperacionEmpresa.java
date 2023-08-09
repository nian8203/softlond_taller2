package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import taller_2.models.Cliente;
import taller_2.models.Empresa;

public class OperacionEmpresa {
	

	protected Empresa agregarEmpresa() {
		List<Cliente> empleados = new ArrayList<>();
		String empleado = "";
		String cedula = "";
		String empresa = JOptionPane.showInputDialog(null, "Nombre de la empresa", "Registrar cliente",
				JOptionPane.INFORMATION_MESSAGE);
		empleado = JOptionPane.showInputDialog(null, "Nombre quien se hospeda", "Registro personas",
				JOptionPane.INFORMATION_MESSAGE);
		cedula = JOptionPane.showInputDialog(null, "Numero de documento", "Registro personas",
				JOptionPane.INFORMATION_MESSAGE);
		Cliente c = new Cliente(empleado, cedula);
		empleados.add(c);

		return crearRegistroEmpresa(empresa, empleados);

	}

	private Empresa crearRegistroEmpresa(String nombreEmpresa, List<Cliente> empleados) {
        Empresa empresa = new Empresa(); // Crear una nueva instancia de Empresa
        empresa.setNombre(nombreEmpresa);
        empresa.setClientes(empleados);
        return empresa;
    }

	

}
