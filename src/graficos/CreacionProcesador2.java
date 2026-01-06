package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class CreacionProcesador2 {

	public static void main(String[] args) {
		
		MarcoProcesador2 miMarco=new MarcoProcesador2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoProcesador2 extends JFrame{
	
	public MarcoProcesador2() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Procesador de texto Java");
		
		LaminaProcesador2 miLamina=new LaminaProcesador2();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaProcesador2 extends JPanel{
	
	public LaminaProcesador2() {
		
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
	}
	
	public void setMenuItem(String nombre, JMenu menu, String textoTipo, int textoEstilo, int textoTamagno) {
		
		JMenuItem item=new JMenuItem(nombre);
		
		menu.add(item);
		
		
		if(menu.equals(fuente)) {
				
			item.addActionListener(new StyledEditorKit.FontFamilyAction("cambia fuente", textoTipo));
		}else if(menu.equals(estilo)) {
			
			if(textoEstilo==Font.BOLD) {
				
				item.addActionListener(new StyledEditorKit.BoldAction());
			}else if(textoEstilo==Font.ITALIC) {
				
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