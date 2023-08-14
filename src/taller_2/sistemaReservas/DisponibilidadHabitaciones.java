package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;

public class DisponibilidadHabitaciones {
	
	private final CreacionHoteles creacionHoteles;
    private Set<Habitacion> hab;

    public DisponibilidadHabitaciones() {
        this.creacionHoteles = new CreacionHoteles();
        this.hab = new HashSet<>();
    }

	public String validarDisponibilidad(String nombre) {
		
	    String response = "";

	    Hotel hotel = creacionHoteles.listadohoteles().stream().filter(f -> f.getNombre().equals(nombre)).findFirst()
	            .orElse(null);
	    Set<Habitacion> listHabitacionePorHotel = hotel.getHabitaciones().stream().filter(h -> h.isDisponible())
	            .collect(Collectors.toSet());

	    if (listHabitacionePorHotel.size() > 0) {
	        String[] numeroHabitacion = listHabitacionePorHotel.stream().map(Habitacion::getNumero).toArray(String[]::new);

	        String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona un habitacion:",
	                "Habitaciones", JOptionPane.PLAIN_MESSAGE, null, numeroHabitacion, numeroHabitacion[0]);

	        response = seleccion;
	        Habitacion habitacion = listHabitacionePorHotel.stream().filter(h -> h.getNumero().equals(seleccion))
	                .findFirst().orElse(null);

	        habitacion.setDisponible(false);
	    } else {
	        JOptionPane.showMessageDialog(null, "El hotel no tiene habitaciones disponibles.", "Advertencia",
	                JOptionPane.WARNING_MESSAGE);
	    }

	    listHabitacionePorHotel.forEach(
	            h -> System.out.println("numero = " + h.getNumero() + "\t| disponibilidad = " + h.isDisponible()));

	    hab.addAll(listHabitacionePorHotel);

	    return response;
	}

//	protected Set<Habitacion> validarDisponibilidad2(String nombre) {
//
//		Set<Habitacion> hab = new HashSet<>();
//		Hotel hotel = creacionHoteles.listadohoteles().stream().filter(f -> f.getNombre().equals(nombre)).findFirst()
//				.orElse(null);
//		Set<Habitacion> listHabitacionePorHotel = hotel.getHabitaciones().stream().filter(h -> h.isDisponible())
//				.collect(Collectors.toSet());
//		hab.addAll(listHabitacionePorHotel);
//
//		String opcion = "";
//		while (!opcion.equals("s")) {
//			listHabitacionePorHotel.forEach(
//					h -> System.out.println("numero = " + h.getNumero() + "\t| disponibilidad = " + h.isDisponible()));
//
//			for (Habitacion habitacion : listHabitacionePorHotel) {
//				if (habitacion.isDisponible()) {
//					hab.add(habitacion);
//				} else {
//					hab.remove(habitacion);
//				}
//			}
//
//			if (hab.size() > 0) {
//				String[] numeroHabitacion = hab.stream().map(Habitacion::getNumero).toArray(String[]::new);
//
//				String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona un habitacion:",
//						"Seleccione Hotel", JOptionPane.PLAIN_MESSAGE, null, numeroHabitacion, numeroHabitacion[0]);
//
//				Habitacion habitacion = listHabitacionePorHotel.stream().filter(h -> h.getNumero().equals(seleccion))
//						.findFirst().orElse(null);
//
//				habitacion.setDisponible(false);
//				opcion = "s";
//			} else {
//				JOptionPane.showMessageDialog(null, "El hotel no tiene habitaciones disponibles.", "Advertencia",
//						JOptionPane.WARNING_MESSAGE);
//
//				opcion = "s";
//			}
//
//		}
//
//		return listHabitacionePorHotel;
//	}z

}
