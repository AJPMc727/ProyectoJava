package graficos;

import java.awt.*;

import javax.swing.*;

public class CreacionProcesador {

	public static void main(String[] args) {
		
		MarcoProcesador miMarco=new MarcoProcesador();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoProcesador extends JFrame{
	
	public MarcoProcesador() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Procesador de texto Java");
		
		LaminaProcesador miLamina=new LaminaProcesador();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		JMenuBar barraMenu=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		
		setMenuItem("DejaVu Sans", fuente);
		
		setMenuItem("Liberation Sans", fuente);
		
		setMenuItem("Noto Mono", fuente);
		
		JMenu estilo=new JMenu("Estilo");
		
		setMenuItem("Negrita", estilo);
		
		setMenuItem("Cursiva", estilo);
		
		JMenu tamagno=new JMenu("Tamagno");
		
		setMenuItem("12", tamagno);
		
		setMenuItem("16", tamagno);
		
		setMenuItem("18", tamagno);
		
		setMenuItem("20", tamagno);
		
		barraMenu.add(fuente);
		
		barraMenu.add(estilo);
		
		barraMenu.add(tamagno);
		
		laminaMenu.add(barraMenu);
		
		add(laminaMenu, BorderLayout.NORTH);
	}
	
	public void setMenuItem(String nombre, JMenu menu) {
		
		JMenuItem item=new JMenuItem(nombre);
		
		menu.add(item);
	}
}