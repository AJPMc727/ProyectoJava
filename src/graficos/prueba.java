package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class prueba {

	public static void main(String[] args) {
		
		String fuente=JOptionPane.showInputDialog("Introduce una fuente");
		
		boolean miFuente=false;

		String[] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String e : nombresDeFuentes) {
			
			System.out.println(e);
			if(e.equals(fuente)) {
				
				miFuente=true;
			}
		}
		
		if(miFuente) System.out.println("Fuente instalada");
		else System.out.println("La fuente no esta instalada");
	}

}
