/* TP1 TestEjercicio 8
 * Grupo Nro.: 5
 * Integrantes: Manchinelli
 * Enunciado:
 *	Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero entre 1 y 7
(inclusive) y mostrar el nombre del d�a correspondiente. Si el d�a no est� en el rango
permitido debe emitir por pantalla el mensaje de error "El d�a ingresado no es v�lido".
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(input.nextLine());
		input.close();

		switch (num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("El d�a ingresado no es v�lido9\nA vos te parece que la semana tenga mas de 7 dias, campe�n?");	
			
	   }

    }
}
	
