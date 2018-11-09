package es.cj.ejercicioscadenas;

public class Ejercicio01 {

	// Muestra el string en Mayúsculas. Muestra el string en Minúsculas. Mostrar los 2 primeros 
	// caracteres y los 2 últimos. Número de veces que aparece el último carácter. 
	// Reemplazar todas las veces que se repite el primer carácter por el primer carácter en 
	// mayúscula. Añadir por el principio y por el final la cadena "***"
	
	public static void main(String[] args) {
		String palabra = "ciUdadjardín";
		
		//MAYÚSCULAS
		System.out.println(palabra.toUpperCase());
		
		// MINÚSCULAS
		System.out.println(palabra.toLowerCase());
		
		//Mostrar los dos primeros y los dos últimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length()-2, palabra.length()));
		}
		
		//Número de veces que se repite el último carácter
		String ultimo = palabra.substring(palabra.length()-1);
		System.out.println(ultimo);
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i+1).equalsIgnoreCase(ultimo))
				contador++;
		}
		
		System.out.println(contador);
		
		// reemplazar todas las veces del primer carácter por el primer caracter en mayúsculas
		String primero = palabra.substring(0, 1);
		palabra.replaceAll(primero, primero.toUpperCase());
		System.out.println(palabra);
		
		// Añadir por el principio y por el final la cadena "***"
		
		//palabra = "***" + palabra + "***";
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
	}

}
