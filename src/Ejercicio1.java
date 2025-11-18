import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos=new Scanner(System.in);
		
		int aleatorio=(int)(Math.random()*100)+1;
	
		System.out.println("Adivina el numero escondido");
		
		System.out.println("Cada intento a 1 Dolar");

		int intento=0,costo=0;
		
		while((aleatorio==intento)==false) {

	     intento=datos.nextInt();
			
		 if(intento>aleatorio)System.out.println("Piensa en pequeno");
		 
		 if(intento<aleatorio)System.out.println("Piensa en grande");
		 
		 costo=costo+1;
		 
		}
		
		System.out.println("Felicidades!!! lo lograste :D son " + costo + " Dolares");
		
		datos.close();
		
	}
}
