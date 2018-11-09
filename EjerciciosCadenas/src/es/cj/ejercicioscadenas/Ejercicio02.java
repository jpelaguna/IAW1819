package es.cj.ejercicioscadenas;

public class Ejercicio02 {

	// Realizar un programa que reciba dos cadenas de caracteres y cuente el número
	// de apariciones
	// de la primera en la segunda.

	public static void main(String[] args) {

		String palabra = "hola";
		String frase = "hola que tal hola que pasa hola";

		int contador = 0;
		int pos = frase.indexOf(palabra);

		if (pos != -1) {
			contador++;
			pos = frase.indexOf(palabra, pos + 1);
			}
		

		System.out.println(contador);

	}
// esta mal

}
