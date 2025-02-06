package paquete2;

public class Gato {

	String color = "";
	String raza = "";
	String sexo = "";
	int edad = 0;
	float peso = 0;

	public void maulla() {

		System.out.println("miauuuu");

	}

	public void ronronea() {

		System.out.println("rrrrrrr");

	}

	
	
	public Gato(String color, String sexo, int edad, float peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}

	public void come(String comida) {

		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy ");
		} else {
			System.out.println("Mejor no ");
		}
	}

	String pasaAcadena() {
		String cadena = "";
		
		
		return "Color: "+ color + "sexo: " + sexo + "edad" + edad + "peso: " + peso;
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
}
