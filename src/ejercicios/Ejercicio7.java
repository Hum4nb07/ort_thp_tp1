/* TP1 TestEjercicio 7
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 *	Realizá un programa que al ingresar por teclado tres números enteros num1, num2 y num3, muestre el valor del mayor de todos.
En caso de igualdad entre los tres imprimir "Los números son iguales".
Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1
Test2: num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2  	
Test3: num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3
Test4: num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales

 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(input.nextLine());
		int num2 = Integer.parseInt(input.nextLine());
		int num3 = Integer.parseInt(input.nextLine());
		input.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("El mayor numero es " + num1);
			
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("El mayor numero es " + num2);
			
		} else if (num3 > num1 && num3 > num2) {	
			System.out.println("El mayor numero es " + num3);
			
		} else if (num1 == num2 && num3 == num1) {	
			System.out.println("Los numero son iguales, pajere");
		}
	}
	
}
