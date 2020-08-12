/* TP1 TestEjercicio 10
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 	Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un programa que informe si un estacionamiento se 
 	encuentra o no abierto según la hora ingresada por el usuario.
	Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs.
	(Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
	Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos setear una variable booleana llamada estaAbierto en true 
	o false, según corresponda, e informar por pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el mensaje: “Ha ingresado una hora incorrecta”
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static Scanner input = new Scanner(System.in);
	
	public static final int HORA_APERTURA = 10;
	public static final int HORA_CIERRE = 18;
	
	
	public static void main(String[] args) {
		
		String mensajeAbierto = "El local se encuentra abierto";
		String mensajeCerrado = "El local se encuentra cerrado";
		boolean estaAbierto;
		
		System.out.println("Ingrese horario:");
		int horaUsuario = Integer.parseInt(input.nextLine());
		
			while (horaUsuario <=0 || horaUsuario > 23) {
			System.out.println("Ha ingresado un hora incorrecta\nVuelva a ingresar el horario:");
			horaUsuario = Integer.parseInt(input.nextLine());
			}
		input.close();
		
		if (horaUsuario >= HORA_APERTURA && horaUsuario < HORA_CIERRE) {
			estaAbierto = true;
			System.out.println(estaAbierto + "\n" + mensajeAbierto);
			 
		  } else if (horaUsuario <= HORA_APERTURA || horaUsuario >= HORA_CIERRE) {
			estaAbierto = false;
			System.out.println(estaAbierto + "\n" + mensajeCerrado);
		  } 
		
	
	}

}

