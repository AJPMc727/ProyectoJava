import java.util.*;

public class CondicionalIF {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu salario, por favor");

		int dinero=entrada.nextInt();
		
		/* Condicional if (saca dos conclusiones de un dato true o else
		 * dependiendo del estado del dato determinara siertas acciones  */
		if(dinero>=22000) {
			System.out.println("Eres rico");
		}
		else {
			System.out.println("Eres pobre");
		}
		
		System.out.println("Introduce tu edad, por favor");
		
		/* else if(dato) se utiliza para cuando el dato sea verdadero
		 * se rompa la cadena de condicionales22*/
		int edad=entrada.nextInt();
		
		if(edad<=18) {
			System.out.println("eres muy chango");
		}
		else if(edad<=30) {
			System.out.println("Eres chango");
		}
		else if(edad<=60) {
			System.out.println("Eres maduro");
		}
		else if(edad<=90) {
			System.out.println("Cuida la espalda");
		}
		else {
			System.out.println("Viviste mucho :(");
		}
		
	}

}
