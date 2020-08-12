/* TP1 Ejercicio 3
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 * 	Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Por favor, escriba su nombre");
		String nombre = input.nextLine();
		System.out.println("Bienvenido " + nombre + ".");
		input.close();

	}

}
