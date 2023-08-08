package taller_2.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

import taller_2.models.Alumno;

public class SistemaAlumnos {

//	private final Alumno alumno;
	private static Scanner sc = new Scanner(System.in);
	private List<Double> notas = new ArrayList<>();
	private Set<Alumno> alumnos = new HashSet<>();


	protected Alumno crearAlumno() {
		String msg = "INGRESE LOS SIGUIENTES DATOS";
		String nombre = JOptionPane.showInputDialog(null, "- Nombre:", msg, JOptionPane.PLAIN_MESSAGE);
		String edad = JOptionPane.showInputDialog(null, "- Edad:", msg, JOptionPane.PLAIN_MESSAGE);
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setEdad(edad);
		alumno.setCalificaciones(notas);

		alumnos.add(alumno);
		listadoAlumnos();
		System.out.println(alumno.toString());
		return alumno;
	}

	private void listadoAlumnos() {
		System.out.println("\n\n===========================================================");
		System.out.println("=====================LISTADO DE ALUMNOS========================");
		System.out.println("| Nombre         | Edad          | Calificaciones     |");
		alumnos.forEach(a -> System.out.printf("| %-14s | %-13s | %-16s\n", a.getNombre(), a.getEdad(), a.getCalificaciones()));
		System.out.println("===============================================================");
	}

	protected Alumno asignarNotas() {
		listadoAlumnos();
		StringBuilder alumnosList = new StringBuilder();
		alumnos.forEach(a -> alumnosList.append("- " + a.getNombre()).append("\n"));
		JOptionPane.showMessageDialog(null, "Listado de Alumnos:\n" + alumnosList.toString(), "Listado de Alumnos",
				JOptionPane.INFORMATION_MESSAGE);
		
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno:", "Ingresar Nombre",
				JOptionPane.QUESTION_MESSAGE);
		Alumno alumno = alumnos.stream().filter(a -> a.getNombre().equals(nombre)).findFirst().orElse(null);
		System.out.println(alumno.toString());
		notasAlumno(alumno);
		String message = "==========ASIGNAR NOTAS==========\n- Para finalizar = '0'\n\n";
		message += "Nombre: " + alumno.getNombre() + "\n";
		message += "Edad: " + alumno.getEdad() + "\n";
		message += "Notas:\n";
		for (Double nota : notas) {
			message += nota + "\n";
		}
		message += "=================================\n";
//		System.out.println(alumno.toString());
		return alumno;
	}

	private Alumno notasAlumno(Alumno alumno) {
		List<Double> n = new ArrayList<>();
		try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)) {
			boolean estado = true;
			do {
				String notaStr = JOptionPane.showInputDialog(null, "- Ingrese la nota:\n- salir: '0'",
						"- Ingresar Nota\n- Salir '0'", JOptionPane.QUESTION_MESSAGE);
//				System.out.print("Ingresar La nota: ");
				double nota = Double.parseDouble(notaStr);
				if ((int)nota != 0) {
					n.add(nota);
				}
				if ((int) nota == 0) {
					entrada.close();
					estado = false;
				}
			} while (estado);
			System.out.println("\n=================================");
			System.out.println("       NOTAS DEL ALUMNO==========");
//		notas.forEach(n -> System.out.print("nota = "+n));
			alumno.setCalificaciones(n);
			System.out.println(alumno.toString());			
		}
		listadoAlumnos();
		return alumno;
	}

	protected void buscarAlumno() {
		String nombre = JOptionPane.showInputDialog(null, "- Ingrese el nombre: ");

		Alumno alumno = alumnos.stream().filter(a -> a.getNombre().equals(nombre)).findFirst().orElse(null);
		if (alumno == null) {
            JOptionPane.showMessageDialog(null, "Alumno no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
		List<Double> listaNotas = alumno.getCalificaciones();
		
		String promedio = promedio(listaNotas);
		String msg =  "Nombre: " + alumno.getNombre() + "\n";
		msg += "Edad: " + alumno.getEdad() + "\n";
		msg += "Notas: "+ alumno.getCalificaciones()+"\n";
		msg += "Promedio: " + promedio;
        JOptionPane.showMessageDialog(null, msg, "Información del Alumno", JOptionPane.INFORMATION_MESSAGE);
	}

	private String promedio(List<Double> notas) {
		DecimalFormat formato = new DecimalFormat("#.#");
		int cont = 0;
		double res = 0;
		for (Double d : notas) {
			res += d;
			cont++;
		}
		double resFinal = res / cont;
        String numeroFormateado = formato.format(resFinal);
		return numeroFormateado;
	}

}
