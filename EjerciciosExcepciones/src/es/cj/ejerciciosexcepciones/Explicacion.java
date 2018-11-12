package es.cj.ejerciciosexcepciones;

import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			int valor = 100/0;
			System.out.println(valor);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());;
		}

	}

}
