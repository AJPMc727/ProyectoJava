package graficos;

import javax.swing.*;

import java.awt.*;

public class EscribiendoEnMarco {
	
	public static void main(String[] args) {
		
		MarcoConTexto miMarco=new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTexto extends JFrame{

	public MarcoConTexto() {
		
		setSize(400,350);
		
		setLocation(200,200);
		
		setTitle("Primer Texto");
		
		setVisible(true);
		
		Lamina miLamina=new Lamina();
		
		add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estoy aprendiedo a programar en Java :D", 100, 100);
	}
}