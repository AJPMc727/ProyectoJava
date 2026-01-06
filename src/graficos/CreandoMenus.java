package graficos;

import javax.swing.*;

public class CreandoMenus {

	public static void main(String[] args) {
		
		MarcoDeMenus miMarco=new MarcoDeMenus();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDeMenus extends JFrame{
	
	public MarcoDeMenus() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Menus en Java");
		
		LaminaDeMenus miLamina=new LaminaDeMenus();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaDeMenus extends JPanel{
	
	public LaminaDeMenus() {
		
		JMenuBar barraMenu=new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		
		JMenu edicion=new JMenu("Edicion");
		
		JMenu herramientas=new JMenu("Herramientas");
		
		barraMenu.add(archivo);
		
		barraMenu.add(edicion);
		
		barraMenu.add(herramientas);
		
		JMenuItem guardar=new JMenuItem("Guardar");
		
		JMenuItem guardarComo=new JMenuItem("Guardar como");
		
		archivo.add(guardar);
		
		archivo.add(guardarComo);
		
		JMenuItem cortar=new JMenuItem("Cortar");
		
		JMenuItem copiar=new JMenuItem("Copiar");
		
		JMenuItem pegar=new JMenuItem("Pegar");
		
		JMenu opciones=new JMenu("Opciones");
		
		JMenuItem op1=new JMenuItem("Opciones 1");
		
		JMenuItem op2=new JMenuItem("Opciones 2");
		
		opciones.add(op1);
		
		opciones.add(op2);
		
		edicion.add(cortar);
		
		edicion.add(copiar);
		
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		JMenuItem configuracion=new JMenuItem("Configuracion");
		
		herramientas.add(configuracion);
		
		add(barraMenu);
	}
}