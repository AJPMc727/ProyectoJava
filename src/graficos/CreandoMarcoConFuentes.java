package graficos;

import java.awt.*;

import javax.swing.*;

public class CreandoMarcoConFuentes {

	public static void main(String[] args) {
		
		MarcoConFuentes miMarco=new MarcoConFuentes();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setSize(400,400);
		
		setTitle("Marco con tipos de fuentes");
		
		LaminaConFuentes miLamina=new LaminaConFuentes();
		
		add(miLamina);	
		
		miLamina.setForeground(Color.MAGENTA);
	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font miFuente=new Font("Serif",Font.ITALIC,50);
		
		g2.setFont(miFuente);
		
		//g2.setColor(Color.BLUE);
		
		g2.drawString("Puto el que lo lea", 100, 100);
		
		g2.setFont(new Font("Utopia",Font.BOLD,25));
		
		//g2.setColor(new Color(128,59,45).brighter());
		
		g2.drawString("No te rindas!!!", 100, 200);
	}
}