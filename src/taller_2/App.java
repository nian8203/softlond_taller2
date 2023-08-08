package taller_2;

import java.util.List;

import taller_2.models.Empresa;
import taller_2.sistemaReservas.CreacionEmpresas;
import taller_2.sistemaReservas.OperacionCliente;
import taller_2.sistemaReservas.OperacionHotel;
import taller_2.utils.Conversion;
import taller_2.utils.Menu;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Menu menu = new Menu();
//		menu.menuConversiones();
		
//		OperacionCliente reservas = new OperacionCliente();
//		reservas.solicitarDatosCliente();
//		
//		OperacionHotel hotel = new OperacionHotel();
//		hotel.solicitardatosHotel();
		
		CreacionEmpresas empresas = new CreacionEmpresas();
		empresas.listadoEmpresas().forEach(e -> System.out.println(e.getNombre()+e.getClientes().toString()));;
		

	}

}
