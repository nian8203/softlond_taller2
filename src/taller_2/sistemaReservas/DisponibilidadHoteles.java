package taller_2.sistemaReservas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;
import taller_2.models.Reservacion;

public class DisponibilidadHoteles {

	private final CreacionHoteles creacionHoteles;
    private final DisponibilidadHabitaciones disponibilidadHabitaciones;
    private final Reservacion reservacion;

    public DisponibilidadHoteles() {
        this.creacionHoteles = new CreacionHoteles();
        this.disponibilidadHabitaciones = new DisponibilidadHabitaciones();
        this.reservacion = new Reservacion();
    }

	public Hotel validarDisponibilidad() {

		Hotel hotel = null;
		int cont = 0;

		while (cont < 5) {
			List<Hotel> listadoHoteles = creacionHoteles.listadohoteles();

			String[] hoteles = listadoHoteles.stream().map(Hotel::getNombre).toArray(String[]::new);

			String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona un habitacion:",
					"Seleccione Hotel", JOptionPane.PLAIN_MESSAGE, null, hoteles, hoteles[0]);

			String habitacion = disponibilidadHabitaciones.validarDisponibilidad(seleccion);
			System.out.println(habitacion);

//			hotel = new Hotel(seleccion, habitaciones);
		}

//		List<Hotel> listadoHoteles = creacionHoteles.listadohoteles();
//		
//		String[] hoteles = listadoHoteles.stream().map(Hotel::getNombre).toArray(String[]::new);
//		
//		String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona un habitacion:",
//				"Seleccione Hotel", JOptionPane.PLAIN_MESSAGE, null, hoteles, hoteles[0]
//		);
//		
//		Set<Habitacion> habitaciones = disponibilidadHabitaciones.validarDisponibilidad(seleccion);
//		habitaciones.forEach(h -> h.getNumero());
//		
//		Hotel hotel = new Hotel(seleccion, habitaciones);

		return hotel;
	}
}
