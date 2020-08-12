/* TP1 Ejercicio 4
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 * 	Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2.
Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: “La
suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Por favor, ingrese dos (2) numeros enteros.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();
		int suma = num1 + num2;
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado: " + suma);
		
	}
}
