package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;
import taller_2.models.Cliente;
import taller_2.models.Empresa;

public class CreacionEmpresas {
	
	public List<Empresa> listadoEmpresas(){
//		crearEmpresas().forEach(e -> System.out.println(e.toString()));
		return crearEmpresas();
	}

	private List<Cliente> crearEmpleados() {
		List<Cliente> empleados = new ArrayList<>();
		Cliente c1 = new Cliente("juan", "123456");
		Cliente c2 = new Cliente("pedro", "1234578");
		Cliente c3 = new Cliente("jhon", "1234545");
		Cliente c4 = new Cliente("ana", "1234456");
		Cliente c5 = new Cliente("marta", "123454896");
		Cliente c6 = new Cliente("yuli", "12345123");
		Cliente c7 = new Cliente("jose", "1234987");
		Cliente c8 = new Cliente("nicolas", "123454526");
		Cliente c9 = new Cliente("alejandro", "123454206");
		Cliente c10 = new Cliente("maria", "1237896");
		Cliente c11 = new Cliente("matias", "123451236");
		Cliente c12 = new Cliente("rodrigo", "12348521");
		
		empleados.add(c1);
		empleados.add(c2);
		empleados.add(c3);
		empleados.add(c4);
		empleados.add(c5);
		empleados.add(c6);
		empleados.add(c7);
		empleados.add(c8);
		empleados.add(c9);
		empleados.add(c10);
		empleados.add(c11);
		empleados.add(c12);
		
		return empleados;
	}
	
	
	private List<Empresa> crearEmpresas(){
		List<Empresa> empresas = new ArrayList<>();
		List<Cliente> clientes = crearEmpleados();
		List<Cliente> c1 = new ArrayList<>();
		List<Cliente> c2 = new ArrayList<>();
		List<Cliente> c3 = new ArrayList<>();
		List<Cliente> c4 = new ArrayList<>();
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		Empresa e3 = new Empresa();
		Empresa e4 = new Empresa();
		
		for (int i = 0; i < clientes.size(); i++) {
			if (i <= 2) {
				c1.add(clientes.get(i));
				e1 = new Empresa("Empresa_1 = ", c1);
			}else if (i > 2 && i <=5) {
				c2.add(clientes.get(i));
				e2 = new Empresa("Empresa_2 = ", c2);
			}else if (i > 5 || i <= 9) {
				c3.add(clientes.get(i));
				e3 = new Empresa("Empresa_3 = ", c2);
			}else {
				c4.add(clientes.get(i));
				e4 = new Empresa("Empresa_3 = ", c2);
			}
		}
		empresas.add(e1);	
		empresas.add(e2);
		empresas.add(e3);
//		System.out.println(empresas);
		return empresas;
		
	}
	
	
	
	
	
}
