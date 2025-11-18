
public class ManipulacionCadenas {

	public static void main(String[] args) {
		
		// Objeto creado :)
		String nombre="Andres";
		
		//Metodo length() (Longitud de la cadena)
		int longitud=nombre.length();
		
		//*System.out.println(longitud);
		
		// o si quieres solo imprimirloen consola 
		
		System.out.println("Mi nomre tiene " + nombre.length() + " letras");
		
		// Metodo charAt (Devuelve la posicion de un caracter dentro de una cadena)
		System.out.println("La última letra de mi nombre es " + 
		nombre.charAt(nombre.length()-1));
		
		// Metodo Substring (Devuelve la subcadena dentro de la cadena) 
		String frase="hoy es un estupendo dia para aprender a progrmar en Java";
		
		String subcadena=frase.substring(1);
		
		System.out.println(subcadena);
		
		// Metodo equals (Devuelve true si dos cadenas son iguales=
		// Metodo equalsIgnoreCase (Igual que el anterior pero sin tener en cuenta mayusculas y minisculas)z
		String alumno1="David";
		
		String alumno2="DavId";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
