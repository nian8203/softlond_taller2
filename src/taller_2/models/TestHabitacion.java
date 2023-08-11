package taller_2.models;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import taller_2.sistemaReservas.CreacionHoteles;

public class TestHabitacion {

	 private final CreacionHoteles creacionHoteles = CreacionHoteles.getInstance();
	    private Hotel hotelSeleccionado;

	    public void seleccionHotel() {
	        creacionHoteles.listadohoteles().forEach(
	                h -> System.out.println("Hotel = " + h.getNombre() + "\t| habitaciones = " + h.getHabitaciones()));
	        String seleccion = JOptionPane.showInputDialog(null, "Selecione un hotel", "Hoteles",
	                JOptionPane.INFORMATION_MESSAGE);
	        hotelSeleccionado = creacionHoteles.listadohoteles().stream().filter(h -> h.getNombre().equals(seleccion))
	                .findFirst().orElse(null);

	        seleccionHabitacion();
	    }

	    public void seleccionHabitacion() {
	        hotelSeleccionado.getHabitaciones().forEach(h -> System.out.println("Habitaciones = " + h.getNumero()));
	        String seleccion = JOptionPane.showInputDialog(null, "Selecione una habitación", "Habitaciones",
	                JOptionPane.INFORMATION_MESSAGE);
	        Habitacion habitacion = hotelSeleccionado.getHabitaciones().stream()
	                .filter(h -> h.getNumero().equals(seleccion)).findFirst().orElse(null);
	        habitacion.setDisponible(false);
	        hotelSeleccionado.getHabitaciones()
	                .forEach(h -> System.out.println("Habitaciones = " + h.getNumero() + " " + h.isDisponible()));
	    }



}
