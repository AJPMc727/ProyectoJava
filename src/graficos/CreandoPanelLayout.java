package graficos;

import java.awt.*;

import javax.swing.*;

public class CreandoPanelLayout {

	public static void main(String[] args) {
		
		MarcoPanelLayout miMarco=new MarcoPanelLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPanelLayout extends JFrame{
	
	public MarcoPanelLayout() {
		
		setBounds(250, 150, 750, 500);
		
		setTitle("Marco de Layout");
		
		LaminaPanelLayout miLamina=new LaminaPanelLayout();
		
		//FlowLayout miDisposicion=new FlowLayout(FlowLayout.LEFT, 50, 50);
		
		//miLamina.setLayout(miDisposicion);
		
		LaminaPanelLayout2 miLamina2=new LaminaPanelLayout2();
		
		add(miLamina, BorderLayout.NORTH);
		
		add(miLamina2, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}

class LaminaPanelLayout extends JPanel{
	
	public LaminaPanelLayout() {
		
		//setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 10));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Azul"), BorderLayout.NORTH);
		
		add(new JButton("Amarillo"), BorderLayout.SOUTH);
		
	}
}

class LaminaPanelLayout2 extends JPanel{
	
	public LaminaPanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Rojo"), BorderLayout.EAST);
		
		add(new JButton("Verde"), BorderLayout.WEST);
		
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
}