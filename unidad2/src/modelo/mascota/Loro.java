package modelo.mascota;

public class Loro extends Aves{

	private String origen;
	private Boolean habla;
	

	@Override
	public boolean habla() {
		
		return habla;
	}

	@Override
	public String muestra() {
		return "Loro [origen=" + origen + ", habla=" + habla + "]";
	}

	public void saluda(){
		System.out.println("Hola");
	}
	
	public Boolean vuela(){
		return vuela;}
	
}
