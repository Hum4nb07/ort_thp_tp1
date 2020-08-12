/* TP1 Ejercicio 5
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 * 	Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
teclado por el usuario, muestre el resultado de la división del primero por el segundo
siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
“No se puede dividir por cero”.
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();

		if(num2 == 0) {
			System.out.println("No se puede dividir por cero, capo.");
		} else {
			int result = num1/num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
		}
	}	
}
