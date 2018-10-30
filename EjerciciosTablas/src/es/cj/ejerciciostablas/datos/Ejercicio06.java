package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio06 {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;
	
	public static void main(String[] args) {
		
	do {
		System.out.println("nº elmenetos : ");
		tamanyo = sc.nextInt();
	} while (tamanyo <=0);
	
	tabla = new int[tamanyo];
	
	eliminarPosicion();
	
	mostrarTabla();
	
	sc.close();
	
	int valor;
	do {
		
	} while (valor < 0 || posicion > tamanyo);

		

	}
	
	private static void eliminarPosicion() {
		for (int i = posicion; i < tabla.length - 1; i++)
			tabla[i] = tabla[i+1];
		}
	tabla[tabla.length - 1] = 0;

	private static void inicializarTabla() {
		for (int = 0; i < tabla.length; i++)
		
		
	}
	


}
