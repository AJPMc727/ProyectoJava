import java.util.*;

public class usoTallas {

	// enum Talla {MINI, MEDIANO, GRANDE, MUY_GARNDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String Abreviatura) {
			
			this.Abreviatura=Abreviatura;
		}
		
		public String dameAbreviatura() {
			
			return Abreviatura;
		}
		
		private String Abreviatura;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe tu talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entradaDatos=entrada.next().toUpperCase();
		
		Talla laTalla=Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("La talla: " + laTalla);
		
		System.out.println("Abreviatura: " + laTalla.dameAbreviatura());
		
		/* Talla s=Talla.MINI;
		
		Talla m=Talla.MEDIANO;
		
		Talla l=Talla.GRANDE;
		
		Talla xl=Talla.MUY_GARNDE;*/
		
		
		
		
		
	}
}
