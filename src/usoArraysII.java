import javax.swing.*;

public class usoArraysII {

	public static void main(String[] args) {
		
		/*String[] paises=new String[9];
		
		paises[0]="Bolivia";
		paises[1]="Argentina";
		paises[2]="Chile";
		paises[3]="Peru";
		paises[4]="Paraguay";
		paises[5]="Brasil";
		paises[6]="Mexico";
		paises[7]="Venezuela";
		paises[8]="Espana";*/
		
		//String [] paises={"Bolivia", "Chile", "Peru", "Argentina", "Mexico"};
		
		String [] paises=new String[5];
		
		for(int i=0; i<paises.length; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce un pais");}
		
		for(String elemento:paises) System.out.println("Pais: " + elemento);
	}
}
