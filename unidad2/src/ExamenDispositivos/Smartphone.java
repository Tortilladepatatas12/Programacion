package ExamenDispositivos;

public class Smartphone extends Telefono{

	public Smartphone(String marca, String modelo, double precio) {
		super(marca, modelo, precio);
		// TODO Auto-generated constructor stub
	}

	private int cantidadCamaras;

	@Override
	public double calcularPrecioDescuento() {
		 setPrecio(getPrecio() - getPrecio()/100*15);
		return super.calcularPrecioDescuento();
	}
	
	

	
}
