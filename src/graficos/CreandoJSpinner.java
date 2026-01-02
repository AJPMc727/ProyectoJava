package graficos;

import java.awt.*;
import javax.swing.*;

public class CreandoJSpinner {

	public static void main(String[] args) {
		
		MarcoJSpinner miMarco=new MarcoJSpinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoJSpinner extends JFrame{
	
	public MarcoJSpinner() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("JSpinner");
		
		LaminaJSpinner miLamina=new LaminaJSpinner();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaJSpinner extends JPanel{
	
	public LaminaJSpinner() {
		
		String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		JSpinner control=new JSpinner(new SpinnerListModel(lista));
		
		Dimension d=new Dimension(200, 20);
		
		control.setPreferredSize(d);
		
		add(control);
	}
	
	private class MiModeloSpinner extends SpinnerNumberModel{
		
		public MiModeloSpinner() {
			
			super(5, 0, 10, 1);
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
	}
}