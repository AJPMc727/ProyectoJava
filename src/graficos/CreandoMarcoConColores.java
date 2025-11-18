package graficos;

import javax.swing.*;

import java.awt.*;

import java.awt.geom.*;

public class CreandoMarcoConColores {

	public static void main(String[] args) {
		
		MarcoConColores miMarco=new MarcoConColores();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConColores extends JFrame{
	
	public MarcoConColores() {
		
		setSize(400, 400);
		
		setTitle("Marco con Colores");
		
		LaminaConColores lamina=new LaminaConColores();
		
		add(lamina);
		
		lamina.setBackground(Color.BLACK);
	}
}

class LaminaConColores extends JPanel{
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,200);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrame(rectangulo);
		
		g2.setPaint(new Color(109,172,59));
		
		g2.fill(circulo);
	}
}