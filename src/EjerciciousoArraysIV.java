
public class EjerciciousoArraysIV {

	public static void main(String[] args) {
		

final double acumulado = 10000;

		double [][] saldo = new double[5][6];

		for(int i=0; i<5;i++) {

			for(int j=0;j<6;j++) {

				if(i==0) {

					saldo[i][j] = acumulado;

				}else {

					saldo[i][j] = saldo[i-1][j]*(1.1 + 0.01*j);

				}

				System.out.printf( "%.2f" + " € ",saldo[i][j]);

			}

			

			System.out.println();

		}
	}
}
