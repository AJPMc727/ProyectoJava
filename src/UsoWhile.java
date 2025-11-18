import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args){
		
		String clave="Pachacuti";
		
		String pass="";
		
		/* while (condicion) {mientras la condcion sea verdadera el buble se 
		 * repetira indefinitivamente*/
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrasena");
		
			if(clave.equals(pass)==false)System.out.println("Contasena incorrecta");
			
		}
		
		System.out.println("Acceso concedido");
		
	}
	
	
}
