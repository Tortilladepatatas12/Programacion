package orientacionAobjetos;

public class GestionaPokemons {

	public static void main(String[] args) {
		
		Pokemon pikachu = new Pokemon();
		pikachu.nombre ="Pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Eléctrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.nombre="Mewtwo";
		mew2.nivel=20;
		mew2.tipo="Psiquico";
		
		String cadenaPikachu = pikachu.convierteEnCadena();
		System.out.println(cadenaPikachu);
		String cadenamew2 = pikachu.convierteEnCadena();
		System.out.println(cadenamew2);
		
		
		boolean gana = pikachu.luchar(mew2);
		System.out.println("Pikachu gana a Mew2?" + gana);
		
		cadenaPikachu = pikachu.convierteEnCadena();
		System.out.println(cadenaPikachu);
		cadenamew2 = mew2.convierteEnCadena();
		System.out.println(cadenamew2);
		
		
		
		
		
		
	}

}
