package gestionEmpleados;
class Administrativo extends Empleados {
	int extraProductividad;
	public Administrativo(String nombre, String dni, int salario, int extraProductividad) {
		super(nombre, dni, salario);
		
	}

	
	
	int SumaSalarioExtra(){
		
		int salario2 = salario + extraProductividad;
		return salario2;
		
	}
	
}
