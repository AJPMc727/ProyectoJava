
public class casting {

	public static void main(String[] args) {
		
		byte numero1=52;
		
		byte numero2=25;
		
		int resultado=(byte)(numero1+numero2);
		
		System.out.println(((Object)(numero1+numero2)).getClass().getSimpleName());
	}

}
