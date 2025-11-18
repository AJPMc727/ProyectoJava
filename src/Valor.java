
public class Valor {

	public static void main(String[] args) {
		
		Clase1 obj=new Clase1();
		
		int num=5;
		
		obj.duplicar(num);
		
		System.out.println("El valor de num es: " + num);
		
		
	}
}	
class Clase1{
	
	void duplicar(int x) {
		
		x=x*2;
		
		System.out.println("El valor de x es: " + x);
	}
}


