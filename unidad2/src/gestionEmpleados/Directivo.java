package gestionEmpleados;

class Directivo extends Empleados {
	int bonificacion;
	public Directivo(String nombre, String dni, int salario, int bonificacion) {
		super(nombre, dni, salario);
	}

	
	
	int SumaBonificacion() {
	
		int salariobonificado = salario + bonificacion;
	
	return salariobonificado; 	
	}
	
}
