import java.util.*;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		/*if(edad<18)System.out.println("Eres menor de edad");
		
		else System.out.println("Eres mayor de edad");*/
		
		// Operador ternario (Simplifica la condiciona if y else)
		String resultado=(edad<18)? "Eres menor de edad":"Eres mayor de edad";
		
		System.out.println(resultado);

	}

}
