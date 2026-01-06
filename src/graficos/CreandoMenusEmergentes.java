package graficos;

import java.awt.*;

import javax.swing.*;

public class CreandoMenusEmergentes {

	public static void main(String[] args) {
		
		MarcoMenusEmergentes miMarco=new MarcoMenusEmergentes();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoMenusEmergentes extends JFrame{
	
	public MarcoMenusEmergentes() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Menus Emergentes");
		
		LaminaMenusEmergentes miLamina=new LaminaMenusEmergentes();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaMenusEmergentes extends JPanel{
	
	public LaminaMenusEmergentes() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		JMenuBar barraMenu=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		
		JMenu estilo=new JMenu("Estilo");
		
		JMenu tamaño=new JMenu("Tamaño");
		
		barraMenu.add(fuente);
		
		barraMenu.add(estilo);
		
		barraMenu.add(tamaño);
		
		laminaMenu.add(barraMenu);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		JTextPane miTexto=new JTextPane();
		
		add(miTexto, BorderLayout.CENTER);
		
		//------------------------------------------------------------------
		
		JPopupMenu emergentes=new JPopupMenu();
		
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		
		JMenuItem opcion3=new JMenuItem("Opcion 3");
		
		emergentes.add(opcion1);
		
		emergentes.add(opcion2);
		
		emergentes.add(opcion3);
		
		miTexto.setComponentPopupMenu(emergentes);
	}
}