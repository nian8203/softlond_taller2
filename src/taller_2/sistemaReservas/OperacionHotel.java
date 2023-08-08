package taller_2.sistemaReservas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;

public class OperacionHotel {
	
//	private final Hotel hotel;
//	
//	public OperacionHotel(Hotel hotel) {
//		this.hotel = new Hotel(null, null);
//	}

	public void solicitardatosHotel() {
	    int opcion;

	    do {
	        opcion = JOptionPane.showConfirmDialog(null, "¿Desea crear un hotel?", "Crear Hotel",
	                JOptionPane.YES_NO_OPTION);

	        if (opcion == JOptionPane.YES_OPTION) {
	            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
	            Set<Habitacion> habitaciones = habitaciones();
	            crearHotel(nombre, habitaciones);
	            System.out.println("finalizado");
	            crearHotel(nombre, habitaciones).toString();
	        }
	    } while (opcion == JOptionPane.YES_OPTION);
	}

	private Hotel crearHotel(String nombre, Set<Habitacion> habitaciones) {
	    Hotel nuevoHotel = new Hotel(nombre, habitaciones);
	    System.out.println(nuevoHotel.toString());
	    return nuevoHotel;
	}

	private Set<Habitacion> habitaciones() {
	    int opcion;
	    Set<Habitacion> listadoHabitaciones = new HashSet<>();

	    do {
	        opcion = JOptionPane.showConfirmDialog(null, "¿Desea crear una habitación?", "Crear Habitacion",
	                JOptionPane.YES_NO_OPTION);

	        if (opcion == JOptionPane.YES_OPTION) {
	            Habitacion habitacion = new Habitacion();
	            
	            String numero = JOptionPane.showInputDialog(null, "Ingrese el numero de habitación");
	            habitacion.setNumero(numero);
	            listadoHabitaciones.add(habitacion);

	            JOptionPane.showMessageDialog(null, "Habitación " + habitacion.getNumero() + " creada y agregada.");
	        }
	    } while (opcion == JOptionPane.YES_OPTION);

	    return listadoHabitaciones;
	}


	
}
