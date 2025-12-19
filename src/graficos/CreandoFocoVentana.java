package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class CreandoFocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		
		CreandoFocoVentana miVentana=new CreandoFocoVentana();
		
		miVentana.iniciar();
	}

	public void iniciar() {
		
		ventana1=new CreandoFocoVentana();
		
		ventana2=new CreandoFocoVentana();
		
		ventana1.setVisible(true);
		
		ventana2.setVisible(true);
		
		ventana1.setBounds(100, 100, 600, 350);
		
		ventana2.setBounds(1000, 100, 600, 350);
		
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana1.addWindowFocusListener(this);
		
		ventana2.addWindowFocusListener(this);
		
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ventana1) {
			
			ventana1.setTitle("Tengo el foco");
		}else {
			
			ventana2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ventana1) {
			
			ventana1.setTitle("");
		}else {
			
			ventana2.setTitle("");
		}
	}
	
	CreandoFocoVentana ventana1;
	
	CreandoFocoVentana ventana2;
}
