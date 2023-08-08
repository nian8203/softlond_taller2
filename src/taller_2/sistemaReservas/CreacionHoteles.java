package taller_2.sistemaReservas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import taller_2.models.Habitacion;
import taller_2.models.Hotel;

public class CreacionHoteles {
	
	public List<Hotel> listadohoteles(){
		return crearHoteles();
	}

	private List<Hotel> crearHoteles() {
		
		List<Habitacion> habitaciones = crearHabitaciones();
		List<Hotel> hotelList = new ArrayList<>();
		Set<Habitacion> ho1 = new HashSet<>();
		Set<Habitacion> ho2 = new HashSet<>();
		Set<Habitacion> ho3 = new HashSet<>();
		Hotel h1 = null;
		Hotel h2 = null;
		Hotel h3 = null;
		
		
		
		for (int i = 0; i < habitaciones.size(); i++) {
			if (i <= 5) {
				ho1.add(habitaciones.get(i));
				h1 = new Hotel("La estancia", ho1);
			}else if (i > 5 && i <= 9) {
				ho2.add(habitaciones.get(i));
				h2 = new Hotel("El recuerdo", ho2);
			}else {
				ho3.add(habitaciones.get(i));
				h3 = new Hotel("Sin fronteras", ho3);
			}
		}
		hotelList.add(h1);
		hotelList.add(h2);
		hotelList.add(h3);
		
		return hotelList;
	}

	private List<Habitacion> crearHabitaciones() {
		Habitacion h1 = new Habitacion("101");
		Habitacion h2 = new Habitacion("102");
		Habitacion h3 = new Habitacion("103");
		Habitacion h4 = new Habitacion("201");
		Habitacion h5 = new Habitacion("202");
		Habitacion h6 = new Habitacion("203");
		Habitacion h7 = new Habitacion("15");
		Habitacion h8 = new Habitacion("16");
		Habitacion h9 = new Habitacion("17");
		Habitacion h10 = new Habitacion("18");
		Habitacion h11 = new Habitacion("203");
		Habitacion h12 = new Habitacion("301");
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(h1);
		habitaciones.add(h2);
		habitaciones.add(h3);
		habitaciones.add(h4);
		habitaciones.add(h5);
		habitaciones.add(h6);
		habitaciones.add(h7);
		habitaciones.add(h8);
		habitaciones.add(h9);
		habitaciones.add(h10);
		habitaciones.add(h11);
		habitaciones.add(h12);

		return habitaciones;
	}
}
