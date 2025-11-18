
public class Coche {
	
	public Coche() {
		
		ruedas=4;
		
		ancho=1.8;
		
		peso=1400;
	    
		alto=1.5;
		
		color="blanco";
	}
	
	private int ruedas;
	
	private double ancho;
	
	private double alto;

	private int peso;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public String getColor() {
		
		return "El coche es de color " + color;
	}
	
	public int getRuedas() {
		return ruedas;
	} 
	
	public double getAncho() {
		return ancho;
	}

	public double getAlto() {
		return alto;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setColor(String c) {
		color=c;
	}

	public void setAncho(double n) {
		if(n<1.7 || n>1.9) {
			System.out.println("El ancho del coche es incorrecto");
		}else {
			ancho=n;
		}
	}

	public void setAlto(double a) {
		if(a<1.4 || a>1.6) {
			System.out.println("La altura del coche es incorrecta");
		}else {
			alto=a;
		}
	}

	public void setPeso(int p) {
		if(p<1200 || p>1500) {
			System.out.println("El peso del coche es incorrecto");
		}else {
			peso=p;
		}
	}
	
	public void setRuedas(int r) {
		if(r<3 || r>4) {
			System.out.println("El n de ruedas no puede ser ese");
			}else {
			ruedas=r;}
	}

	void arrancar() {
		
	}
	
	void frenar() {
		
	}
	
	void girar() {
		
	}
	
	//Inicio de los videos antiguos
	
	public String datos_generales() {
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
		". Mide " + alto + " metros con un ancho de " +  ancho + 
		" m y un peso de " + peso + " Kg";
	}
	
	public void  asientos_cuero(String asientos_cuero) {    //setter
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {  //getter
		
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche lleva asientos de serie";
		}
	}
	
	public void climatizador(String climatizador) {  //setter
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {      //getter
		
		if(climatizador==true) {
			
			return "El coche lleva climatizador";
		}else {
			return "El coche lleva aire condicionado";
		}
	}
	
	public String dime_peso_coche() {     //setter and getter
		
		int peso_chasis=500;
		
		peso_total=peso+peso_chasis;
		
		if(asientos_cuero==true) {
			
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			
			peso_total=peso_total+20;
		}
		
		return "El peso total del coche es de:" + peso_total + " Kg";
	}
	
	public String dime_precio() {
		
		int precio_coche=10000;
		
		if(asientos_cuero==true) {
			
			precio_coche+=500;
		}
		
		if(climatizador==true) {
			
			precio_coche+=200;
		}
		
		return "El precio del coche es de: " + precio_coche + "$";
	}
	
}

