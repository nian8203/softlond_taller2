package taller_2.models;

import java.math.BigDecimal;

public class Moneda {

	private final Double PESOS_DOLAR = 0.00025;
	private final Double PESOS_EURO = 0.00023;
	private final Double DOLAR_EURO = 0.91;
	private Double PESO = 1d;
	private Double monedaEntrada;

	public Moneda() {
		super();
	}

	public Moneda(Double monedaEntrada) {
		super();
		this.monedaEntrada = monedaEntrada;
	}

	public Double getMonedaEntrada() {
		return monedaEntrada;
	}

	public void setMonedaEntrada(Double monedaEntrada) {
		this.monedaEntrada = monedaEntrada;
	}

	public Double getDOLAR() {
		return PESOS_DOLAR;
	}

	public double getEURO() {
		return PESOS_EURO;
	}
	
	public double getDOLAR_EURO() {
		return DOLAR_EURO;
	}

}
