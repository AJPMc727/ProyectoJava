package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class CreandoMarcoConImagenes {

	public static void main(String[] args) {
		
		MarcoConImagenes miMarco=new MarcoConImagenes();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConImagenes extends JFrame{
	
	public MarcoConImagenes() {
		
		setBounds(150,150,450,300);
		
		setTitle("Ventana con imagenes");
		
		LaminaConImagenes miLamina=new LaminaConImagenes();
		
		add(miLamina);
	}
}

class LaminaConImagenes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File miImagen=new File("/home/ajpm/Desktop/Java/ProyectJavaI/src/graficos/bcsPoster.jpg");
		
		try {
			
		imagen=ImageIO.read(miImagen);
		}
		catch(IOException e){
			System.out.println("La imagen no fue encontrada");
		}
		
		g.drawImage(imagen, 0, 0, null);
		
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		//System.out.println(anchuraImagen + " " + alturaImagen);
		for(int i=0;i<300;i++) {
			
			for(int j=0;j<200;j++) {
				
				if(i+j>0) {
				//g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
			}
			}
		}
	}

private Image imagen;	
}