package ExamenDispositivos;

public class Laptop extends Computadora {

	public Laptop(String marca, String modelo, double precio) {
		super(marca, modelo, precio);
		// TODO Auto-generated constructor stub
	}

	private double peso;

	@Override
	public double calcularPrecioDescuento() {
		if(peso < 2) {
			setPrecio(getPrecio() - getPrecio()/100*20);
		}
		else {
			setPrecio(getPrecio() - getPrecio()/100*12);
		}
		return super.calcularPrecioDescuento();
	}
	
	
}
