package modelo.mascota;

public class Gato extends Mascotas{

	private String color;
	private Boolean peloLargo;
	


	@Override
	public String muestra() {
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}

	@Override
	public boolean habla() {
		return false;
	}

}
