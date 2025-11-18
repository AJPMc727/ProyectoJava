import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner datos=new Scanner(System.in);
		
		String genero=" ";
		
		do {
			System.out.println("Introduce tu genero (H/M)");
			
			genero=datos.nextLine();
			
		}while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
	
	        int altura=0,peso=0;
	
	System.out.println("Introduce tu altura en cm");
	
	        altura=datos.nextInt();
	        
	if (genero.equalsIgnoreCase("H")){
		
		peso=altura-110;
	}
	
	if (genero.equalsIgnoreCase("M")) {
		
		peso=altura-120;
	}
	
	System.out.println("Tu peso ideal es de : " + peso);
	}
		
}
