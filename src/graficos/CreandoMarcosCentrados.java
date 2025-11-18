package graficos;

import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.*;

public class CreandoMarcosCentrados {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco=new MarcoCentrado();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("UHC Beta");
		
		Image miIcono=miPantalla.getImage("src/graficos/UHCBeta.png");
		
		setIconImage(miIcono);
	}
}