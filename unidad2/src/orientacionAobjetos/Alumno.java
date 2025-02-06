package orientacionAobjetos;

public class Alumno {

String nombre = "";
String dni = "";
float nota = 0 ;

String pasoACadena() 
{
String cadena="Nombre: "+nombre+" Dni: "+dni+" nota: "+ nota;
//TODO 
return cadena;	
}

boolean estaAprobado() {
	
	boolean aprobado = true;
	if (nota>=5)
	{
	return aprobado;
	}
	else
	{
	
		aprobado = false;
	}
	return aprobado;
}

}

