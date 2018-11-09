package es.cj.ejercicioscadenas;

public class Ejercicio01 {

	// Muestra el string en May�sculas. Muestra el string en Min�sculas. Mostrar los 2 primeros 
	// caracteres y los 2 �ltimos. N�mero de veces que aparece el �ltimo car�cter. 
	// Reemplazar todas las veces que se repite el primer car�cter por el primer car�cter en 
	// may�scula. A�adir por el principio y por el final la cadena "***"
	
	public static void main(String[] args) {
		String palabra = "ciUdadjard�n";
		
		//MAY�SCULAS
		System.out.println(palabra.toUpperCase());
		
		// MIN�SCULAS
		System.out.println(palabra.toLowerCase());
		
		//Mostrar los dos primeros y los dos �ltimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length()-2, palabra.length()));
		}
		
		//N�mero de veces que se repite el �ltimo car�cter
		String ultimo = palabra.substring(palabra.length()-1);
		System.out.println(ultimo);
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i+1).equalsIgnoreCase(ultimo))
				contador++;
		}
		
		System.out.println(contador);
		
		// reemplazar todas las veces del primer car�cter por el primer caracter en may�sculas
		String primero = palabra.substring(0, 1);
		palabra.replaceAll(primero, primero.toUpperCase());
		System.out.println(palabra);
		
		// A�adir por el principio y por el final la cadena "***"
		
		//palabra = "***" + palabra + "***";
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
		
	}

}
