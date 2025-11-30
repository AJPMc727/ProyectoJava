package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoEventosDeVentanas {

	public static void main(String[] args) {
		
		EventosDeVentanas miMarco=new EventosDeVentanas("Ventana 1", 300, 300, 350, 500);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EventosDeVentanas miMarco2=new EventosDeVentanas("Ventana 2", 600, 300, 350, 500);
		
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class EventosDeVentanas extends JFrame{
	
	public EventosDeVentanas(String tituloVentana, int xDeVentana, int yDeVentana, int alturaDeVentana, int anchuraDeVentana) {
		
		setBounds(xDeVentana,yDeVentana,anchuraDeVentana,alturaDeVentana);
		
		setTitle(tituloVentana);
		
		setVisible(true);
		
		VentanasConEventos oyente=new VentanasConEventos();
		
		addWindowListener(oyente);
	}
}

class VentanasConEventos extends WindowAdapter{
	
	/*public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana se esta cerrando");
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
	}
	public void windowDeactivated(WindowEvent w) {
		
		System.out.println("Ventana desactivada");
	}
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}*/
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
	/*public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
	}*/
	}