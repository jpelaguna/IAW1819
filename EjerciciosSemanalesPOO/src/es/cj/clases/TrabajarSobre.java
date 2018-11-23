package es.cj.clases;

public class TrabajarSobre {

	public static void calcularIMC(Persona p) {
		
		if ((p.getPeso() / (p.getAltura() * p.getAltura())) < 20)
			System.out.println("-1");
		else if ((p.getPeso() / (p.getAltura() * p.getAltura())) > 20 && (p.getPeso() / (p.getAltura() * p.getAltura())) < 25)
			System.out.println("0");
		else
			System.out.println("1");
	}
	
	public static void esMayorDeEdad(Persona p) {
		
		if (p.getEdad() > 18)
			System.out.println("Es mayor de edad");
		
		else
			System.out.println("Es menor de edad");
		
	}
	
}