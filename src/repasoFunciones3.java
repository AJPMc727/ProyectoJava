
public class repasoFunciones3 {

	public static void main(String args[]) {
		
		int numero=factorialNumero(5);
		
		System.out.println(numero);
		
	}
	
	public static int factorialNumero(int num) {
		
		for(int i=num;i>1;i--) {
			
			num=num*(i-1);		}
		
		return num;
	}
}
