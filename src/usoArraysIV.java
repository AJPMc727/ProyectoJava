
public class usoArraysIV {

	public static void main(String[] args) {
		
		int [][] matrix= {
				{12,56,74,23,45},
				{1,57,10,14,42},
				{21,45,68,34,54},
				{89,34,23,21,100},
		};
		
		/*for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}*/
		
		for (int [] fila:matrix) {
			
			for(int contenido:fila) {
				
				System.out.print(contenido + " ");
			}
			
			System.out.println();
		}
	}
}
