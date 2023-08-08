package taller_2.utils;

import java.util.Scanner;

import javax.swing.JOptionPane;

import taller_2.models.Alumno;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private final SistemaAlumnos sistemaAlumnos;
	private final Conversion conversion;
	private final Operaciones operaciones;

//	public Menu(SistemaAlumnos registroAlumnos, Conversion conversion) {
//		this.sistemaAlumnos = registroAlumnos;
//		this.conversion = conversion;
//	}

	public Menu() {
		this.sistemaAlumnos = new SistemaAlumnos();
		this.conversion = new Conversion();
		this.operaciones = new Operaciones();
	}

	public void menu() {
		int opcion;
		do {
			System.out.println("\n===== MENU PRINCIPAL =====");
			System.out.println("**Seleccione una opción**");
			System.out.println("1- Registros de alumnos");
			System.out.println("2- Conversor de monedas");
			System.out.println("3- Calculadora simple");
			System.out.println("4- Sistema reservas hotel");
			System.out.println("5- Salir");
			System.out.println("==========================\n");

			System.out.print("Ingrese una opción: ");
			opcion = sc.nextInt();
			subMenu(opcion);
			break;
			// seleccionMenuPrincipal(opcion);
		} while (opcion != 5);
		sc.close();
	}

	private void subMenu(int opcion) {
		// Código del método seleccionMenuPrincipal

		switch (opcion) {
		case 1:
			menuAlumno();
			break;
		case 2:

			break;

		default:
			break;
		}
	}

	public void menuAlumno() {
		int opcion;

		do {
			String menuMsg = "===== MENU ALUMNOS =====\n" + "**Seleccione una opción**\n" + "1- Crear alumno\n"
					+ "2- Asignar calificaciones\n" + "3- Buscar alumno\n" + "5- Salir\n"
					+ "==========================\n";

			String opcionStr = JOptionPane.showInputDialog(null, menuMsg);
			opcion = Integer.parseInt(opcionStr);

			switch (opcion) {
			case 1:
				sistemaAlumnos.crearAlumno();
				break;
			case 2:
				sistemaAlumnos.asignarNotas();
				break;
			case 3:
				sistemaAlumnos.buscarAlumno();
				break;
			case 5:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (opcion != 5);

		JOptionPane.showMessageDialog(null, "Programa finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
	}

	public void menuConversiones() {
		int opcion;

		do {
			String menuMsg = "===== MENU CONVERSIONES =====\n" + "**Seleccione una opción**\n" + "1- Pesos a dolares\n"
					+ "2- Pesos a euros\n" + "3- Dolares a euros\n" + "4- Salir\n" + "==============================\n";

			String opcionStr = JOptionPane.showInputDialog(null, menuMsg);
			opcion = Integer.parseInt(opcionStr);

			switch (opcion) {
			case 1:
				conversion.solicitarDato(opcion);
				break;
			case 2:
				conversion.solicitarDato(opcion);
				break;
			case 3:
				conversion.solicitarDato(opcion);
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (opcion != 4);

		JOptionPane.showMessageDialog(null, "Programa finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
	}

	public void menuCalculadora() {
		int opcion;

		do {
			String menuMsg = "===== MENU CALCULADORA =====\n" + "**Seleccione una opción**\n" + "1- Suma\n"
					+ "2- Resta\n" + "3- Multiplicación\n" + "4- División\n" + "5- Salir\n" + "==============================\n";

			String opcionStr = JOptionPane.showInputDialog(null, menuMsg);
			opcion = Integer.parseInt(opcionStr);

			switch (opcion) {
			case 1:
				operaciones.operaciones(opcion);
				break;
			case 2:
				operaciones.operaciones(opcion);
				break;
			case 3:
				operaciones.operaciones(opcion);
				break;
			case 4:
				operaciones.operaciones(opcion);
				break;
			case 5:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (opcion != 5);

		JOptionPane.showMessageDialog(null, "Programa finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
	}

}
