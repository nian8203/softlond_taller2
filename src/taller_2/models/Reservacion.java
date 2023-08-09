package taller_2.models;

public class Reservacion {

	private Empresa empresa;
	private String hotel;
	private String habitacion;

	public Reservacion() {
		super();
	}

	public Reservacion(Empresa empresa, String hotel, String habitacion) {
		super();
		this.empresa = empresa;
		this.hotel = hotel;
		this.habitacion = habitacion;
	}

	public String getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Reservacion [empresa=" + empresa + ", hotel=" + hotel + ", habitacion=" + habitacion + "]";
	}

	

}
