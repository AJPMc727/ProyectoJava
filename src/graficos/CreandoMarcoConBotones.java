package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoMarcoConBotones {

	public static void main(String[] args) {
		
		MarcoConBotones miMarco=new MarcoConBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConBotones extends JFrame{
	
	public MarcoConBotones() {
		
		setBounds(100,100,350,250);
		
		setTitle("Marco con botones");
		
		LaminaConBotones miLamina=new LaminaConBotones();
		
		add(miLamina);
	}
}

class LaminaConBotones extends JPanel{
	
	public LaminaConBotones() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		botonAzul.addActionListener(azul);
		
		botonAmarillo.addActionListener(amarillo);
		
		botonRojo.addActionListener(rojo);
	}
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	ColorDeFondo azul=new ColorDeFondo(Color.BLUE);
	
	ColorDeFondo amarillo=new ColorDeFondo(Color.YELLOW);
	
	ColorDeFondo rojo=new ColorDeFondo(Color.RED);
	
	private class ColorDeFondo implements ActionListener{
		
		public ColorDeFondo(Color c) {
			
			colorDeFondo=c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
	}
}