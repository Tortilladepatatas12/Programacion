package ExamenDispositivos;

import java.util.Objects;

public class Dispositivo {

	private String marca;
	private String modelo;
	private double precio;
	
	public double calcularPrecioDescuento(){
		 precio = precio - precio/100*10;
		return precio;
	}

	
	
	@Override
	public String toString() {
		return "Marca: " + marca + "Modelo: " + modelo + "Precio: " + precio + " Precio con descuento: "+ calcularPrecioDescuento();
	}



	public Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		if(precio <0) {
			System.out.println("Error el precio es negativo ");
			precio=1;
		return precio;}
		else {
			return precio;
		}
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
	
}
