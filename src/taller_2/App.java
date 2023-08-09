package taller_2;

import java.util.List;

import taller_2.models.Cliente;
import taller_2.models.Empresa;
import taller_2.sistemaReservas.CreacionEmpresas;
import taller_2.sistemaReservas.CreacionHoteles;
import taller_2.sistemaReservas.OperacionCliente;
import taller_2.sistemaReservas.OperacionHotel;
import taller_2.sistemaReservas.OperacionReservacion;
import taller_2.sistemaReservas.OperacionesHabitacion;
import taller_2.utils.Conversion;
import taller_2.utils.Menu;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.menu();
		
//		CreacionEmpresas empresas = new CreacionEmpresas();
//		empresas.listadoEmpresas().forEach(e -> System.out.println(e.getNombre()));
//		Empresa e1 = empresas.listadoEmpresas().stream().filter(e -> e.getNombre().equals("Empresa_1")).findFirst().orElse(null);
//		List<Cliente> c1 = e1.getClientes();
//		System.out.println("Empresa 1 = "+c1);
//
//		OperacionReservacion reservacion = new OperacionReservacion();
//		reservacion.habitacionesDisponibles();
		
//		OperacionReservacion reservacion = new OperacionReservacion();
//		reservacion.cicloCrearReserva();

	}

}
