package graficos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreandoMultiplesFuentes {

	public static void main(String[] args) {
		
		MarcoMultiplesFuentes miMarco=new MarcoMultiplesFuentes();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
}

class MarcoMultiplesFuentes extends JFrame{
	
	public MarcoMultiplesFuentes() {
		
		setBounds(200, 150, 650, 400);
		
		setTitle("Multiples fuentes");
		
		LaminaMultiplesFuentes miLamina=new LaminaMultiplesFuentes();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaMultiplesFuentes extends JPanel{
	
	public LaminaMultiplesFuentes() {
		
		/*JButton botonAzul=new JButton("Azul");
		
		JButton botonAmarillo=new JButton("Amarillo");
		
		JButton botonRojo=new JButton("Rojo");*/
		
		ImageIcon iconoAzul=new ImageIcon(getClass().getResource("/graficos/IconoAzul.png"));
		
		MultiplesFuentes botonAzul=new MultiplesFuentes("Azul", iconoAzul, Color.BLUE);
		
		//MultiplesFuentes botonAmarillo=new MultiplesFuentes("Amarillo", new ImageIcon(getClass().getResource("/graficos/IconoAmarillo.jpeg")), Color.YELLOW);
		
		//MultiplesFuentes botonRojo=new MultiplesFuentes("Rojo", new ImageIcon(getClass().getResource("/graficos/IconoRojo.jpeg")), Color.RED);
		
		add(new JButton(botonAzul));
	}
}

class MultiplesFuentes extends AbstractAction{

	public MultiplesFuentes(String nombre, Icon icono, Color ColorBoton) {
		
		putValue(Action.NAME, nombre);
		
		putValue(Action.SMALL_ICON, icono);
		
		putValue(Action.SHORT_DESCRIPTION, "Cambia el fondo de color " + nombre);
		
		putValue("Color de Fondo", ColorBoton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}