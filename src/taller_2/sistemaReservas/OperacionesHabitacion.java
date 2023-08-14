package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;
import taller_2.models.Reservacion;

public class OperacionesHabitacion {

	int contador = 0;
	String globalHotel = "";
	private final CreacionHoteles hoteles;
	private List<Habitacion> habDrop = new ArrayList<>();

	public OperacionesHabitacion() {
		this.hoteles = new CreacionHoteles();
	}

	protected String listadoHabitacionesDisponibles(String hotel) {

		Set<Habitacion> habitacionesDisponibles = hoteles.listadohoteles().stream()
				.filter(h -> h.getNombre().equals(hotel)).flatMap(h -> h.getHabitaciones().stream())
				.filter(h -> h.isDisponible()).collect(Collectors.toSet());
		System.out.println("despues de impresion" + habitacionesDisponibles);

		System.out.println("hotel antes = " + globalHotel);

		if (habDrop.isEmpty()) {
			habDrop.addAll(habitacionesDisponibles);
			contador++;
			System.out.println("es vacio" + habDrop + "\ncontador = " + contador);
		} 

			globalHotel = hotel;
		System.out.println("hotel despues = " + globalHotel);

		System.out.println("es vacio" + habDrop + "\ncontador = " + contador);

		String[] numeroHabitacion = habDrop.stream().map(Habitacion::getNumero).toArray(String[]::new);

		String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona un habitacion:", "Habitaciones",
				JOptionPane.PLAIN_MESSAGE, null, numeroHabitacion, numeroHabitacion[0]);

		Habitacion habSetear = habDrop.stream().filter(h -> h.getNumero().equals(seleccion)).findFirst().orElse(null);
		habSetear.setDisponible(false);
		System.out.println(habSetear);
		habDrop.remove(habSetear);
		System.out.println(habDrop);

		return seleccion;
	}
	
	
}
