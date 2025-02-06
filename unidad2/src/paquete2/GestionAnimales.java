package paquete2;

public class GestionAnimales {

	public static void main(String[] args) {

		Animal perro = new Animal();
		//perro.edad; No es visible porque es private
		perro.nombre = "juan ";
		perro.tipo="perro";
		
		Animal gato = new Animal();
		gato.nombre="gato";
		gato.tipo="gato";
		//perro.tipo; No es visible porque tiene visibilidad por defecto y está en otro paquete
		boolean anda = perro.caminar();
		System.out.println(anda);
		//perro.comer();
		perro.darDeComer();
		gato.darDeComer();
		
	}

}
