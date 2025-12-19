package graficos;

import java.awt.event.*;

import javax.swing.*;

public class CreandoEventosDeRaton {

	public static void main(String[] args) {
		
		MarcoDeEventosDeRaton miMarco=new MarcoDeEventosDeRaton();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDeEventosDeRaton extends JFrame{
	
	public MarcoDeEventosDeRaton() {
		
		setBounds(700,300,600,450);
		
		setVisible(true);
		
		setTitle("Eventos de raton");
		
		EventosDeRaton eventoRaton=new EventosDeRaton();
		
		addMouseMotionListener(eventoRaton);
	}
}

/*class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Has hecho click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de levantar");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de salir");
	}
	
	
}*/

/*class EventosDeRaton extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {	
		//System.out.println("Coordenada en X: " + e.getX() + " Coordenada en Y: " + e.getY());
		
		System.out.println(e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el boton izquierdo");
		else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) System.out.println("Has pulsado el boton de la rueda");
		else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) System.out.println("Has pulsado el boton derecho");
	}
}*/

class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas arrastrando el raton");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas moviendo el raton");
	}
}