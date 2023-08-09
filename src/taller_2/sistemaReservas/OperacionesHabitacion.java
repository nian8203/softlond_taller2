package taller_2.sistemaReservas;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;

public class OperacionesHabitacion {
	
	private final CreacionHoteles hoteles;
	
	public OperacionesHabitacion() {
		this.hoteles = new CreacionHoteles();
	}
	
	protected String listadoHabitacionesDisponibles(String hotel) {
		List<Habitacion> habitacionesDisponibles = habitacionesDsiponibles(hotel);
		String[] numeroHabitacion = habitacionesDisponibles.stream()
															.map(Habitacion::getNumero)
															.toArray(String[]::new);
		
		String seleccion = (String) JOptionPane.showInputDialog(
		        null,
		        "Selecciona un habitacion:",
		        "Seleccione Hotel",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        numeroHabitacion,
		        numeroHabitacion[0]  // Valor predeterminado (primer hotel)
		);
		return seleccion;
	}
	
	private List<Habitacion> habitacionesDsiponibles(String nombreHotel){
		Hotel hotel = hoteles.listadohoteles().stream().filter(h -> h.getNombre().equals(nombreHotel)).findFirst().orElse(null);
//		System.out.println("hotel = "+hotel.toString());
		Set<Habitacion>listadoHabitaciones = hotel.getHabitaciones();
		List<Habitacion> habitacionesDisponibles = listadoHabitaciones.stream()
		        .collect(Collectors.toList());

//		habitacionesDisponibles.forEach(System.out::println);
		return habitacionesDisponibles;
		
	}
}
