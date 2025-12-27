package graficos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

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
		
		ImageIcon iconoAzul=new ImageIcon(getClass().getResource("/graficos/IconoAzul.jpeg"));
		
		Image azulEscalado= iconoAzul.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		ImageIcon iconoBlue= new ImageIcon(azulEscalado);
		
		ImageIcon iconoAmarillo=new ImageIcon(getClass().getResource("/graficos/IconoAmarillo.jpeg"));
		
		Image amarilloEscalado= iconoAmarillo.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		ImageIcon iconoYellow= new ImageIcon(amarilloEscalado);
		
		ImageIcon iconoRojo=new ImageIcon(getClass().getResource("/graficos/IconoRojo.jpeg"));
		
		Image rojoEscalado= iconoRojo.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		ImageIcon iconoRed= new ImageIcon(rojoEscalado);
		
		MultiplesFuentes botonAzul=new MultiplesFuentes("Azul", iconoBlue, Color.BLUE);
		
		MultiplesFuentes botonAmarillo=new MultiplesFuentes("Amarillo", iconoYellow, Color.YELLOW);
		
		MultiplesFuentes botonRojo=new MultiplesFuentes("Rojo", iconoRed, Color.RED);
		
		add(new JButton(botonAzul));
		
		add(new JButton(botonAmarillo));
		
		add(new JButton(botonRojo));
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarilla=KeyStroke.getKeyStroke("ctrl A");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		
		ActionMap teclaAccion=getActionMap();
		
		teclaAccion.put("fondoAmarillo", botonAmarillo);
		
		teclaAccion.put("fondoAzul", botonAzul);
		
		teclaAccion.put("fondoRojo", botonRojo);
	}
	
	private class MultiplesFuentes extends AbstractAction{

		public MultiplesFuentes(String nombre, Icon icono, Color ColorBoton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Cambia el fondo de color " + nombre);
			
			putValue("Color de Fondo", ColorBoton);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c=(Color)getValue("Color de Fondo");
			
			setBackground(c);
		}
	}
}

