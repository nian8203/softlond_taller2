package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import taller_2.models.Cliente;
import taller_2.models.Empresa;
import taller_2.models.Habitacion;
import taller_2.models.Hotel;
import taller_2.models.Reservacion;

public class OperacionReservacion {

	private final CreacionHoteles hoteles;
	private final OperacionesHabitacion habitaciones;
	private final OperacionEmpresa operacionEmpresa;
	List<Reservacion> reservaciones = new ArrayList<>();
	
	public OperacionReservacion() {
		this.hoteles = new CreacionHoteles();
		this.habitaciones = new OperacionesHabitacion();
		this.operacionEmpresa = new OperacionEmpresa();
	}
	
	public void cicloCrearReserva() {
        String hotel = crearReserva();
        String habitacion = habitaciones.listadoHabitacionesDisponibles(hotel);
        Empresa empresa = operacionEmpresa.agregarEmpresa();
        Reservacion reservacion = new Reservacion(empresa, hotel, habitacion);
        reservaciones.add(reservacion);  
        System.out.println("\n=======================================");        
        reservaciones.forEach(r -> System.out.println(r.toString()));
        
    }	
	
	public void elininarReserva() {
		List<Reservacion> listadoReservciones = new ArrayList<>();
		
		String[] reserevasCliente = listadoReservciones.stream()
														.map(Reservacion::getEmpresa)
														.toArray(String[]::new);
		
		String seleccion = (String) JOptionPane.showInputDialog(
		        null,
		        "Selecciona una reserva:",
		        "Seleccione Reserva",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        reserevasCliente,
		        reserevasCliente[0] 
		);
		
		Reservacion reservacion = listadoReservciones.stream().filter(r -> r.getEmpresa().equals(seleccion)).findFirst().orElse(null);
		System.out.println(reservacion.toString());
	}
	
	
	
	private String crearReserva() {

		List<Hotel> listadoHoteles = hoteles.listadohoteles();

		String[] nombresHoteles = listadoHoteles.stream()
		        								.map(Hotel::getNombre)
		        								.toArray(String[]::new);

		String seleccion = (String) JOptionPane.showInputDialog(
		        null,
		        "Selecciona un hotel:",
		        "Seleccione Hotel",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        nombresHoteles,
		        nombresHoteles[0] 
		);
		
//		System.out.println(seleccion);
		return seleccion;
	}
	







		

	

}
