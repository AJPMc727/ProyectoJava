import java.util.*;

public class repasoFunciones2 {

	public static void main(String args[]) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe cualquier numero");
		
		if(numeroPrimo(entrada.nextInt())) {
			
			System.out.println("El numero es primo");
		}
		else System.out.println("El numero no es primo");
	}
	
	public static boolean numeroPrimo(int num) {
		int x=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				x++;
			}}
	    return x==2;
	}
}