package MiniSimulacro;

public class Sensores {

	private int distancia;
	private int velocidad;

	public Sensores(int distancia, int velocidad) {
		super();
		this.distancia = distancia;
		this.velocidad = velocidad;
	}
	
	public void avisarObstaculo() {

		if (distancia < 50) {
			System.out.println("Aviso objeto cercano a " + distancia);
		}

	}

	public void avisarVelocidad() {

		if (velocidad > 120) {
			System.out.println("Aviso de velocidad");
		}

	}

	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		if (distancia<0) {
		this.distancia = distancia;}
		else {
			
			this.distancia=0;
			
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
}
