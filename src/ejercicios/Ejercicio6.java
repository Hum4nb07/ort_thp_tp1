/* TP1 TestEjercicio 6
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 * 	Realiz� un programa que solicite al usuario el ingreso por teclado un valor entero mayor
que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
n�mero es par" o "el n�mero es impar". Deber� utilizar el operador �m�dulo� es el caracter '%'
 */


package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Favor de ingresar un numero entero mayor a 0");
		int num1 = Integer.parseInt(input.nextLine());
		input.close();
		num1 %=2;
		if (num1 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}
}
