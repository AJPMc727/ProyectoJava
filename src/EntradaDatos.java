import java.util.Scanner;

public class EntradaDatos {
 
	public static void main(String[] args) {
		
		/* Scanner (nos permite introducir datos al codigo del exterio*/
		// abajo se ve como se crea un Scanner y que los datos saldran de consola
		Scanner datos= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		// next.Line() leer datos y devolverlos como String
		String nombre=datos.nextLine();
		
		System.out.println("Introduce tu apellido, por favor");
		
		String apellido=datos.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		// nextInt() leer datos y devolverlos como Int
		int edad=datos.nextInt();
		
		int año_nacimiento=2025-edad;
		
		System.out.println("Hola " + nombre + " " +  apellido + ", tienes actualmente "
				+ edad + " años y naciste en el año " + año_nacimiento);
		
		// cerrar o terminar con Scanner o la busqueda de datos
		datos.close();
		
		

	}

}
