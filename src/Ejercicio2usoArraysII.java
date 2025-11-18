
/*public class Ejercicio2usoArraysII {

	public static void main(String[] args ) {
		
		int [] numeros=new int[200];
		
		for (int i=0; i<numeros.length; i++) numeros[i]=(int)(Math.random()*100)+1;
		
		for (int elemento:numeros) System.out.print(elemento + " ");
	}
}*/
public class Ejercicio2usoArraysII {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		int[][] arrayDoble = new int[6][3]; 

		

		for(int i=0; i<arrayDoble.length; i++) {

			

			for(int j=0; j<arrayDoble[i].length; j++) {

				

				arrayDoble[i][j] = (int)(Math.random()*100); // llenar array con numeros aleatorios

				

				

				System.out.print(arrayDoble[i][j]+"\t"); // Asi se introduce tabulacion simple

			}

			

			System.out.println();

		}

	}

}
