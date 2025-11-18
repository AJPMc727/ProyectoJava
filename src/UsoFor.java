import javax.swing.*;

public class UsoFor {
	
	public static void main(String[] args) {
		
		String email=JOptionPane.showInputDialog("Introduce tu email, porfavor");
		
		boolean	arroba=false;
		
		boolean punto=false;
		
		int maxArroba=0;
		
		for(int i=0;i<email.length();i++) {
			
			if(email.charAt(i)=='@') {
				arroba=true;
				maxArroba++;
			}
			
			if(maxArroba==2) arroba=false;
			
			if(email.charAt(i)=='.')punto=true;
			
		}
			
	
		if(arroba&&punto==true) System.out.println("Email correcto");
		
		else System.out.println("Email incorrecto");

//System.out.println(maxArroba);
	}
	}
