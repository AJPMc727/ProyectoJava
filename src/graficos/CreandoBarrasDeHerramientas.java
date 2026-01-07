package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoBarrasDeHerramientas {

	public static void main(String[] args) {
		
		MarcoBarrasDeHerramientas miMarco=new MarcoBarrasDeHerramientas();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBarrasDeHerramientas extends JFrame{
	
	public MarcoBarrasDeHerramientas() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Barras de Herramientas");
		
		lamina=new JPanel();
		
		add(lamina);
		
		//Configuracion de acciones
		
		AccionColor colorAzul=new AccionColor("Azul", escaladoImagen("/graficos/IconoAzul.jpeg"), Color.BLUE);
		
		AccionColor colorAmarillo=new AccionColor("Amarillo", escaladoImagen("/graficos/IconoAmarillo.jpeg"), Color.YELLOW);
		
		AccionColor colorRojo=new AccionColor("Rojo", escaladoImagen("/graficos/IconoRojo.jpeg"), Color.RED);
		
		//Creacion de la Accion Exit
		
		Action accionExit=new AbstractAction("Salir", escaladoImagen("/graficos/Boton X.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}
		};
		
		//Creacion del menu de herramientas
		
		JMenuBar barraMenu=new JMenuBar();
		
		JMenu menu=new JMenu("Color");
		
		menu.add(colorAzul);
		
		menu.add(colorAmarillo);
		
		menu.add(colorRojo);
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
		//Creacion de la barra de herramientas
		
		JToolBar barraHerramientas=new JToolBar();
		
		barraHerramientas.add(colorAzul);
		
		barraHerramientas.add(colorAmarillo);
		
		barraHerramientas.add(colorRojo);
		
		barraHerramientas.addSeparator();
		
		barraHerramientas.add(accionExit);
		
		add(barraHerramientas, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre,ImageIcon imagen, Color color) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, imagen);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo " + nombre);
			
			putValue("Color", color);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
		}
	}
	
	public ImageIcon escaladoImagen(String ubicacionImagen) {
		
		ImageIcon imagen=new ImageIcon(getClass().getResource(ubicacionImagen));
		
		Image imagenEscalada=imagen.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		
		ImageIcon iconoImagen=new ImageIcon(imagenEscalada);
		
		return iconoImagen;
	}
	
	private JPanel lamina;
}