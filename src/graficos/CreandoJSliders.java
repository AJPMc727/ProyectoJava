package graficos;

import java.awt.Font;

import javax.swing.*;

public class CreandoJSliders {

	public static void main(String[] args) {
		
		MarcoJSliders miMarco=new MarcoJSliders();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoJSliders extends JFrame{
	
	public MarcoJSliders() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Menus desplegables");
		
		LaminaJSliders miLamina=new LaminaJSliders();
		
		add(miLamina); 
		
		setVisible(true);
	}
}

class LaminaJSliders extends JPanel{
	
	public LaminaJSliders() {
		
		 JSlider control=new JSlider(0 ,100, 50);
		 
		 control.setMajorTickSpacing(50);
		 
		 control.setMinorTickSpacing(25);
		 
		 control.setPaintTicks(true);
		 
		 //control.setPaintLabels(true);
		 
		 control.setFont(new Font("Serif", Font.ITALIC, 12));
		 
		 control.setPaintLabels(true);
		 
		 control.setSnapToTicks(true);
		 
		 add(control);
	}
}