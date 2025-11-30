package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreandoMarcoConEstados {

	public static void main(String[] args) {
		
		MarcoConEstados miMarco=new MarcoConEstados();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConEstados extends JFrame{
	
	public MarcoConEstados() {
		
		setSize(400,350);
		
		setLocation(200,200);
		
		setTitle("Marco con estados");
		
		CambiaEstado estado=new CambiaEstado();
		
		addWindowStateListener(estado);
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("La ventana ha cambiado de estado");
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta maximizada");
		}else if(e.getNewState()==Frame.NORMAL){
			
			System.out.println("La venta esta en su estado normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("La ventana esta minimizada");
		}
	}
}

class LaminaConEstados extends JPanel{
		
}