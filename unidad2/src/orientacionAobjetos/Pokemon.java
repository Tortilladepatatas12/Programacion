package orientacionAobjetos;

public class Pokemon {

String nombre;
int nivel;
String tipo;

String convierteEnCadena() {
String cadena = "Pókemon: "+nombre +" "+nivel+" " +tipo;
return cadena;
}
	

Boolean luchar(Pokemon p2) {
	boolean gana = true;
	
	if (nivel > p2.nivel) {
		
		gana = true;
		nivel = nivel +1;
	}
	else {
		
		gana=false;
		p2.nivel = p2.nivel +1;
		
	}
	return gana;
	
	
}

}
