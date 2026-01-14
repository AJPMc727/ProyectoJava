package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import graficos.CreandoBarrasDeHerramientas;

public class CreacionProcesador3 {

	public static void main(String[] args) {
		
		MarcoProcesador3 miMarco=new MarcoProcesador3();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoProcesador3 extends JFrame{
	
	public MarcoProcesador3() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Procesador de texto Java");
		
		LaminaProcesador3 miLamina=new LaminaProcesador3();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaProcesador3 extends JPanel{
	
	public LaminaProcesador3() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		JMenuBar barraMenu=new JMenuBar();
		
		fuente=new JMenu("Fuente");
		
		setMenuItem("DejaVu Sans", fuente, "DejaVu Sans", 9, 10);
		
		setMenuItem("Liberation Sans", fuente, "Liberation Sans", 9, 10);
		
		setMenuItem("Noto Mono", fuente, "Noto Mono", 9 , 10);
		
		estilo=new JMenu("Estilo");
		
		setMenuItem("Negrita", estilo, "", Font.BOLD, 9);
		
		setMenuItem("Cursiva", estilo, "", Font.ITALIC, 9);
		
		tamagno=new JMenu("Tamagno");
		
		setMenuItem("12", tamagno, "", 9, 12);
		
		setMenuItem("16", tamagno, "", 9, 16);
		
		setMenuItem("18", tamagno, "", 9, 18);
		
		setMenuItem("20", tamagno, "", 9, 20);
		
		barraMenu.add(fuente);
		
		barraMenu.add(estilo);
		
		barraMenu.add(tamagno);
		
		laminaMenu.add(barraMenu);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		texto=new JTextPane();
		
		add(texto, BorderLayout.CENTER);
		
		JPopupMenu menuEmergente=new JPopupMenu();
		
		JMenuItem negritaE=new JMenuItem("Negrita");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		
		JMenuItem cursivaE=new JMenuItem("Cursiva");
		
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		menuEmergente.add(negritaE);
		
		menuEmergente.add(cursivaE);
		
		texto.setComponentPopupMenu(menuEmergente);
		
		//---------------------------------------------------------------------------------
		
		JToolBar barraHerramientas=new JToolBar();
		
		JButton botonNegrita=new JButton(escaladoImagen("/graficos/negrita.png"));
		
		JButton botonCursiva=new JButton(escaladoImagen("/graficos/cursiva.png"));
		
		JButton botonSubrayado=new JButton(escaladoImagen("/graficos/subrayado.jpg"));
		
		JButton botonAzul=new JButton(escaladoImagen("/graficos/IconoAzul.jpeg"));
		
		JButton botonAmarillo=new JButton(escaladoImagen("/graficos/IconoAmarillo.jpeg"));
		
		JButton botonRojo=new JButton(escaladoImagen("/graficos/IconoRojo.jpeg"));
		
		//---------------------------------------------------------------------------------
		
		JButton alIzquierda=new JButton(escaladoImagen("/graficos/izquierda.png"));
		
		JButton alCentrado=new JButton(escaladoImagen("/graficos/centrado.png"));
		
		JButton alDerecha=new JButton(escaladoImagen("/graficos/derecha.png"));
		
		JButton alJustificado=new JButton(escaladoImagen("/graficos/justificado.png"));
		
		botonNegrita.addActionListener(new StyledEditorKit.BoldAction());
		
		botonCursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		botonSubrayado.addActionListener(new StyledEditorKit.UnderlineAction());
		
		botonAzul.addActionListener(new StyledEditorKit.ForegroundAction("Pone azul", Color.BLUE));
		
		botonAmarillo.addActionListener(new StyledEditorKit.ForegroundAction("Pone Amarillo", Color.YELLOW));
		
		botonRojo.addActionListener(new StyledEditorKit.ForegroundAction("Pone rojo", Color.RED));
		
		alIzquierda.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		
		alCentrado.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 1));
		
		alDerecha.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 2));
		
		alJustificado.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 3));
		
		barraHerramientas.add(botonNegrita);
		
		barraHerramientas.add(botonCursiva);
		
		barraHerramientas.add(botonSubrayado);
		
		barraHerramientas.add(botonAzul);
		
		barraHerramientas.add(botonAmarillo);
		
		barraHerramientas.add(botonRojo);
		
		//-------------------------------------------------------------------------------------------------------
		
		barraHerramientas.add(alIzquierda);
		
		barraHerramientas.add(alCentrado);
		
		barraHerramientas.add(alDerecha);
		
		barraHerramientas.add(alJustificado);
		
		barraHerramientas.setOrientation(1);
		
		add(barraHerramientas, BorderLayout.WEST);
	}
	
	public ImageIcon escaladoImagen(String ubicacionImagen) {
		
		ImageIcon imagen=new ImageIcon(getClass().getResource(ubicacionImagen));
		
		Image imagenEscalada=imagen.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		
		ImageIcon iconoImagen=new ImageIcon(imagenEscalada);
		
		return iconoImagen;
	}
	
	public void setMenuItem(String nombre, JMenu menu, String textoTipo, int textoEstilo, int textoTamagno) {
		
		JMenuItem item=new JMenuItem(nombre);
		
		menu.add(item);
		
		
		if(menu.equals(fuente)) {
				
			item.addActionListener(new StyledEditorKit.FontFamilyAction("cambia fuente", textoTipo));
		}else if(menu.equals(estilo)) {
			
			if(textoEstilo==Font.BOLD) {
				
				item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				
				item.addActionListener(new StyledEditorKit.BoldAction());
			}else if(textoEstilo==Font.ITALIC) {
				
				item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				
				item.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}else if(menu.equals(tamagno)){
			
			item.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamagno", textoTamagno));
		}
	}
	
	
	boolean booNegrita=false, booCursiva=false;
	
	private JTextPane texto;
	
	Font letras;
	
	JMenu tamagno, fuente, estilo;
}