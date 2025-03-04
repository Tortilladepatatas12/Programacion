package ExamenYummyYummy;

import java.time.LocalDate;

public class Menus {

	private int idmenu;
	private String nombre;
	private int consumocalorico;
	private float precioventa;
	private float preciocoste;
	private TipoDieta tipodieta;
	private String ContieneFrutoSeco;
	LocalDate fechaDistribucion;
	float preciominimo = preciocoste + (preciocoste / 100 * 30);

	public boolean Sifrutoseco() {

		if (ContieneFrutoSeco == "si") {
			System.out.println("Contiene frutos secos ");
			return true;
		} else {
			System.out.println("No contiene frutos secos ");
			return false;
		}

	}

	public float ComprobarPrecioVenta() {

		if (precioventa < preciominimo && precioventa > 0) {
			precioventa = preciominimo;
			System.out.println("El precio no es el correcto, se ajustará al precio mínimo.");
			return precioventa;
		} 
		else if (precioventa > preciominimo && precioventa > 0) {
			System.out.println("El precio es correcto. ");
			return precioventa;
		}
		return precioventa;
	}

	public void DietaEsBaja() {

		if (consumocalorico < 1000) {
			System.out.println("La dieta es baja en calorias ");
		} else {
			System.out.println("La dieta no es baja en calorias ");
		}

	}

	public boolean ContieneCarne() {

		if (tipodieta == TipoDieta.VEGANO || tipodieta == TipoDieta.VEGETARIANO) {
			System.out.println("No contiene carne");
			return false;
		} else {
			System.out.println("Contiene carne");
			return true;
		}

	}

	@Override
	public String toString() {
		return "Menú: Jueves Febrero" + nombre + "tipo: " + tipodieta + "precio venta: " + precioventa + " fecha: "
				+ fechaDistribucion;
	}

	public int getIdmenu() {
		return idmenu;
	}

	public void setIdmenu(int idmenu) {
		this.idmenu = idmenu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getConsumocalorico() {
		return consumocalorico;
	}

	public void setConsumocalorico(int consumocalorico) {
		this.consumocalorico = consumocalorico;
	}

	public float getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(float precioventa) {
		this.precioventa = precioventa;
	}

	public float getPreciocoste() {
		return preciocoste;
	}

	public void setPreciocoste(float preciocoste) {
		this.preciocoste = preciocoste;
	}

	public TipoDieta getTipodieta() {
		return tipodieta;
	}

	public void setTipodieta(TipoDieta tipodieta) {
		this.tipodieta = tipodieta;
	}

	public String getContieneFrutoSeco() {
		return ContieneFrutoSeco;
	}

	public void setContieneFrutoSeco(String contieneFrutoSeco) {
		ContieneFrutoSeco = contieneFrutoSeco;
	}

	public LocalDate getFechaDistribucion() {
		return fechaDistribucion;
	}

	public void setFechaDistribucion(LocalDate fechaDistribucion) {
		this.fechaDistribucion = fechaDistribucion;
	}

	public float getPreciominimo() {
		return preciominimo;
	}

	public void setPreciominimo(float preciominimo) {
		this.preciominimo = preciominimo;
	}

	public Menus(int idmenu, String nombre, int consumocalorico, float precioventa, float preciocoste,
			TipoDieta tipodieta, String contieneFrutoSeco, LocalDate fechaDistribucion, float preciominimo) {
		super();
		this.idmenu = idmenu;
		this.nombre = nombre;
		this.consumocalorico = consumocalorico;
		this.precioventa = precioventa;
		this.preciocoste = preciocoste;
		this.tipodieta = tipodieta;
		ContieneFrutoSeco = contieneFrutoSeco;
		this.fechaDistribucion = fechaDistribucion;
		this.preciominimo = preciominimo;
	}

}
