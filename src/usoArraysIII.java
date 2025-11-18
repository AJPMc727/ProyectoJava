
public class usoArraysIII {

	public static void main(String[] args) {
		
		int [][] matrix=new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=45;
		matrix[0][2]=22;
		matrix[0][3]=36;
		matrix[0][4]=87;
		
		matrix[1][0]=34;
		matrix[1][1]=65;
		matrix[1][2]=15;
		matrix[1][3]=18;
		matrix[1][4]=67;
		
		matrix[2][0]=78;
		matrix[2][1]=54;
		matrix[2][2]=12;
		matrix[2][3]=2;
		matrix[2][4]=9;
		
		matrix[3][0]=89;System.out.println(matrix[3][4]);
		matrix[3][1]=14;
		matrix[3][2]=22;
		matrix[3][3]=27;
		matrix[3][4]=72;
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<4;j++) {
				
				System.out.print(matrix[j][i] + " ");
			}
			
			System.out.println();
		}
	}
}
