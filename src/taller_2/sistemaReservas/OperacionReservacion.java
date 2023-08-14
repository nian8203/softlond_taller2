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
	List<Habitacion> disponible = new ArrayList<>();
	
	public OperacionReservacion() {
		this.hoteles = new CreacionHoteles();
		this.habitaciones = new OperacionesHabitacion();
		this.operacionEmpresa = new OperacionEmpresa();
	}
	
	public void crearReserva() {
        String hotel = datoReserva();
        String habitacion = habitaciones.listadoHabitacionesDisponibles(hotel);
        System.out.println("habitaciones dis[p = "+habitacion);       
        Empresa empresa = operacionEmpresa.agregarEmpresa();
        Reservacion reservacion = new Reservacion(empresa, hotel, habitacion);
        reservaciones.add(reservacion);  
        System.out.println("\n=======================================");        
        reservaciones.forEach(r -> System.out.println(r.toString()));
        
        // Formatear la cadena con los datos
        String mensaje = "Reservación [\n";
        mensaje += "  empresa= "+reservacion.getEmpresa()+",\n";
        mensaje += "  hotel=" + reservacion.getHotel() + ",\n";
        mensaje += "  habitacion=" + reservacion.getHabitacion() + "\n]";
        
        // Mostrar el mensaje en un JOptionPane
        JOptionPane.showMessageDialog(null, mensaje, "Información de Reservación", JOptionPane.INFORMATION_MESSAGE);
    
        
    }	
		
	
	private String datoReserva() {

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
	


	public void eliminarReserva() {
			
		reservaciones.forEach(h -> System.out.println("valdacion nombre empresa = "+h.getEmpresa().getNombre()));
		String[] reserevasCliente = reservaciones.stream()
														.map(r -> r.getEmpresa().getNombre())
														.filter(n -> !n.isEmpty())
														.toArray(String[]::new);
		for (String nombreEmpresa : reserevasCliente) {
		    System.out.println("Nombre de la empresa: " + nombreEmpresa);
		}
		
		
		String seleccion = (String) JOptionPane.showInputDialog(
		        null,
		        "Selecciona una reserva:",
		        "Seleccione Reserva",
		        JOptionPane.PLAIN_MESSAGE,
		        null,
		        reserevasCliente,
		        reserevasCliente[0] 
		);
		
		reservaciones.forEach(r -> System.out.println("reservaciones despues = "+r.toString()));
		reservaciones.removeIf(r -> r.getEmpresa().getNombre().equals(seleccion));
		reservaciones.forEach(r -> System.out.println("reservaciones antes = "+r.toString()));
	
		JOptionPane.showMessageDialog(null, "Reservación eliminada con exito","Reservación", JOptionPane.INFORMATION_MESSAGE);
	}





		

	

}
