package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class CreandoSliders2 {

	public static void main(String[] args) {
		
		MarcoSliders2 miMarco=new MarcoSliders2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoSliders2 extends JFrame{
	
	public MarcoSliders2() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Componentes Deslizantes");
		
		LaminaSliders2 miLamina=new LaminaSliders2();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaSliders2 extends JPanel{
	
	public LaminaSliders2(){
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la Mancha de cuyo nombre no recuerdo...");
		
		add(texto, BorderLayout.CENTER);
		
		control=new JSlider(8, 48, 12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		
		EventoJSlider miEvento=new EventoJSlider();
		
		control.addChangeListener(miEvento);
		
		JPanel laminaSlider=new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoJSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
		
			texto.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
		}
	}
	
	private JLabel texto;
	
	private JSlider control;
}