import javax.swing.*;

public class Ejercicio2Panels {
	
	public static void main(String[] args) {
		
		String genero=" ";
		
		do {
	 
		genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		
		}while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int peso=0;
		
		if (genero.equalsIgnoreCase("H")) {
			
			peso=altura-110;
			
		}	
			
		if (genero.equalsIgnoreCase("M")) {
			
			peso=altura-120;
		}	
		
		JOptionPane.showMessageDialog(null, "Tu peso ideal es de: " + peso);
	}
}
