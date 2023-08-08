package taller_2.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import taller_2.models.Moneda;

public class Conversion {

	private Moneda moneda = new Moneda();

	public void solicitarDato(int opcion) {
		String pesos = JOptionPane.showInputDialog(null, "- Ingrese la cantidad a convertir ");
		double p = Double.valueOf(pesos);
		if (opcion == 1) {
			pesoADolar(p);
		} else if (opcion == 2) {
			pesoAEuro(p);
		}else {
			dolarAEuro(p);
		}
		
	}

	
	private void pesoAEuro(Double peso) {
		DecimalFormat df = new DecimalFormat("#.00");
		double euro = moneda.getEURO();
//		String res = String.valueOf(peso*euro);
		String res = df.format(peso*euro);
		String msg = "Pesos = " + peso + "\n";
		msg += "Euros = "+res;
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void pesoADolar(Double peso) {
		double dolar = moneda.getDOLAR();
		String res = String.valueOf(peso*dolar);
		String msg = "Pesos = " + peso + "\n";
		msg += "Dolares = "+res;
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
	
		
	private void dolarAEuro(Double dolar) {
		double euro = moneda.getDOLAR_EURO();
		String res = String.valueOf(dolar*euro);
		String msg = "Dolares = " + dolar + "\n";
		msg += "Euros = "+res;
		System.out.println(msg);
		JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
