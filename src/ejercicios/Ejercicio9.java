/* TP1 TestEjercicio 9
 * Grupo Nro.: 1
 * Integrantes: Manchinelli
 * Enunciado:
 	Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del total aportó cada una (indicando nombre y 
 porcentaje) y cuál es el monto del total aportado por las tres.
Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego mostrar lo pedido en el siguiente formato:
Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
  
	public static final String NOMBRE1 = "Rogelio";
	public static final String NOMBRE2 = "Argelio";
	public static final String NOMBRE3 = "Borgelio";
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese capital aportado por " + NOMBRE1);
		int capAport1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese capital aportado por " + NOMBRE2);
		int capAport2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese capital aportado por " + NOMBRE3);
		int capAport3 = Integer.parseInt(input.nextLine());
		input.close();
		int total = capAport1 + capAport2 + capAport3;
		int porcentaje1 = (capAport1*100)/total;
		int porcentaje2 = (capAport2*100)/total;
		int porcentaje3 = (capAport3*100)/total;
	
		
		System.out.println("Nombre: " + NOMBRE1 + ". Capital aportado $" + capAport1 + " Porcentaje del total aportado: %" + porcentaje1);
		System.out.println("Nombre: " + NOMBRE2 + ". Capital aportado $" + capAport2 + " Porcentaje del total aportado: %" + porcentaje2);
		System.out.println("Nombre: " + NOMBRE3 + ". Capital aportado $" + capAport3 + " Porcentaje del total aportado: %" + porcentaje3);
		System.out.println("Monton total aportado $" + total);
	}
}
