package gestionEmpleados;

public class GestionDeEmpleados {

	public static void main(String[] args) {
		
		Administrativo carlos = new Administrativo("carlos", "123454678A", 1200, 40);
		
		Directivo juan = new Directivo("Juan","87654321B",2800,15);

		System.out.println(carlos.toString());
		System.out.println(juan.toString());
		
	}

}
