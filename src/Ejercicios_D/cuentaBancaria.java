package Ejercicios_D;

public class cuentaBancaria {

	private static int contador=0;
	private String numero;
	private final String titular;
	private double saldo;
	
	public cuentaBancaria(String titular) {
		
		if(titular=="null" || titular.isBlank()) System.out.println("Titular Invalido");
		this.titular=titular;
		contador++;
		numero="CTA - " + contador;
		saldo=0.0;
	}
	
	public void depositar(double deposito) {
		
		if(deposito<=0) System.out.println("No se aceptan depositos negativos");
		else saldo+=deposito;
	}
	
	public void retirar(double retiro) {
		
		if(retiro>0) {
		if(retiro>saldo) System.out.println("Evite retiros que superen su saldo actual");
		else saldo-=retiro;
		}
		else System.out.println("No se aceptan retiros negativos");
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public String getNumero() {
		
		return numero;
	}
	
	public String getTitular() {
		
		return titular;
	}

		
public static void main(String[] args) {
			
     cuentaBancaria c1=new cuentaBancaria("Pachacuti");
     
     c1.depositar(15001);
     
     c1.retirar(1);
			
     System.out.println("Titular: " + c1.getTitular() + ", Id: " + c1.getNumero() + " y saldo: " + c1.getSaldo());
	}
}	





