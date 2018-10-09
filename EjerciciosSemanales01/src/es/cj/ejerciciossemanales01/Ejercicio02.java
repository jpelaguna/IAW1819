package es.cj.ejerciciossemanales01;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga 16€ por hora 
		// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 
		// 20€ por cada hora extra

		System.out.println("Introduzca el número de horas trabajadas: ");
		int horas = sc.nextInt();
		
		if (horas > 0 && horas <= 40)
			System.out.println("Su salario es: " + 16 * horas);
		else if (horas > 40)
			System.out.println("Su salario es: " + (16 * 40 + (horas - 40) * 20 ));
		else
			System.out.println("Error");
			
		sc.close();
	}

}
