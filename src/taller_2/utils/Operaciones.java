package taller_2.utils;

import javax.swing.JOptionPane;

public class Operaciones {

	protected void operaciones(int opcion) {
		String numStr1 = JOptionPane.showInputDialog(null, "Ingrese el primer valor: ");
		String numStr2 = JOptionPane.showInputDialog(null, "Ingrese el segundo valor: ");
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);

		String msg = resultado(opcion, num1, num2);
		System.out.println("suma = " + msg);
		JOptionPane.showMessageDialog(null, msg, "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);

	}

	private String resultado(int opcion, int num1, int num2) {
		String msg = "";
		double res = 0;
		if (opcion == 1) {
			res = num1 + num2;
			msg = "El resultado es = " + res + "\n" + num1 + " + " + num2 + " = " + res;
		} else if (opcion == 2) {
			res = num1 - num2;
			msg = "El resultado es = " + res + "\n" + num1 + " - " + num2 + " = " + res;
		} else if (opcion == 3) {
			res = num1 * num2;
			msg = "El resultado es = " + res + "\n" + num1 + " X " + num2 + " = " + res;
		} else {
			System.out.println("division "+num2);
			char div = '\u00F7';
			if (num1 == 0 || num2 == 0) {
				msg = "Error! no se puede dividir por '0'";
			}else {
				res = (double)num1 / num2;
				msg = "El resultado es = " + res + "\n" + num1 + " "+div+" " + num2 + " = " + res;
			}
		}
		return msg;
	}

}
