package modelo;

public abstract class Figura {

	private String color;
	public Figura(String color){
		
	this.color = color;	
	}
	
	public abstract double calcularArea();
	
	public String getColor(){
		return color;
	}
	
	public class Cuadrado extends Figura {

		public Cuadrado(String color) {
			super(color);
			
		}

		@Override
		public double calcularArea() {
			int base = 0;
			int altura =0;
			int area = base*altura;
			
			return area;
		}

		
		public class Triangulo extends Figura{

			public Triangulo(String color) {
				super(color);
				// TODO Auto-generated constructor stub
			}

			@Override
			public double calcularArea() {
				int base =0;
				int altura =0;
				int area = base*altura/2;
				
				return area;
			}
			
			
			
		}
	
		
	}
	
}
