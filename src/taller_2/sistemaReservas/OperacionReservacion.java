package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;
import taller_2.models.Reservacion;

public class OperacionReservacion {

	private final CreacionHoteles hoteles;
	private final CreacionEmpresas empresas;
	
	public OperacionReservacion() {
		this.empresas = new CreacionEmpresas();
		this.hoteles = new CreacionHoteles();
	}
	
	public void listadoHabitaciones() {
		Hotel hotel = new Hotel();
		System.out.println(hotel.getNombre());
		System.out.println(hotel.getHabitaciones());
//		listadoHabitaciones();
	}
	
	
	public String crearReserva2() {
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
		        nombresHoteles[0]  // Valor predeterminado (primer hotel)
		);
		
		System.out.println(seleccion);
		return seleccion;
	}
	
	public String habitacionesDisponibles() {
		String nombreHotel = crearReserva2();
		Hotel hotel = hoteles.listadohoteles().stream().filter(h -> h.getNombre().equals(nombreHotel)).findFirst().orElse(null);
		System.out.println(hotel.toString());
		Set<Habitacion> listadoHabitaciones = hotel.getHabitaciones();
		String[] numeroHabitacion = listadoHabitaciones.stream()
				.map(Habitacion::getNumero)
				.toArray(String[]::new);
		
		String seleccion = (String) JOptionPane.showInputDialog(
		        null,
		        "Selecciona un hotel:",
		        "Seleccione Hotel",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        numeroHabitacion,
		        numeroHabitacion[0]  // Valor predeterminado (primer hotel)
		);
		Habitacion habitacionCambiarEstado = listadoHabitaciones.stream().filter(h -> h.getNumero().equals(seleccion)).findFirst().orElse(null);
		habitacionCambiarEstado.setDisponible(false);
		listadoHabitaciones.forEach(h -> System.out.println(h.toString()));
		System.out.println("seleccion habitacion = "+seleccion);
		List<Habitacion> habitacionesDisponibles = listadoHabitaciones.stream()
		        .filter(Habitacion::isDisponible) // Filtrar habitaciones disponibles
		        .collect(Collectors.toList());

		habitacionesDisponibles.forEach(System.out::println);
		return seleccion;
	}
}
