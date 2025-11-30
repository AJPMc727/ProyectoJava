package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CreandoEventosDeTeclado {

	public static void main(String[] args) {
		
		MarcoEventosDeTeclado miMarco=new MarcoEventosDeTeclado();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEventosDeTeclado extends JFrame{
	
	public MarcoEventosDeTeclado() {
		
		setSize(600,450);
		
		setLocation(100,100);
		
		setTitle("Eventos de Teclado");
		
		EventosDeTeclado tecla=new EventosDeTeclado();
		
		addKeyListener(tecla);
	}
}

class EventosDeTeclado implements KeyListener{
	
	public void keyPressed(KeyEvent e) {
		
		//int codigo=e.getKeyCode();
		
		//System.out.println(codigo);
	}
	
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	public void keyTyped(KeyEvent e) {
		
		char codigo=e.getKeyChar();
		
        System.out.print(codigo);
	}
}