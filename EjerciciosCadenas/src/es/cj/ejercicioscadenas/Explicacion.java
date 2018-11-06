package es.cj.ejercicioscadenas;

public class Explicacion {

	public static void main(String[] args) {
		
		String cadena1 = "hola";
		String cadena2 = "HOLA";
		
		if (cadena1.equals(cadena2))
			System.out.println("Iguales");
		else
			System.out.println("Distintas");
		
		// IgnoreCase
		
		if (cadena1.equalsIgnoreCase(cadena2))
			System.out.println("Iguales");
		else
			System.out.println("Distintas");
		
		// Concatenar
		
		cadena1 = cadena1.concat(cadena2);
		
		System.out.println(cadena1.concat(cadena2));
		
		
		// Primera vez que aparece una letra
		System.out.println(cadena1.indexOf("a"));
		
		// ultima vez que aparece una letra
		System.out.println(cadena1.lastIndexOf("a"));
		
		if (cadena1.contains("lala"))
			System.out.println("Lo tiene");
		
		System.out.println(cadena1.toLowerCase().lastIndexOf("a"));
		
		if (cadena1.equals(("") || cadena1.length() == 0 ||  // falta
				))
			System.out.println("Cadena vacía");
		
		cadena1 = cadena1.replace("h", "p");
		
		System.out.println(cadena1.sub);

	}

}
