package orientacionAobjetos;

public class GestionProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto Producto1 = new Producto();
		Producto1.nombre = "lapiz";
		Producto1.numunidades = 0;
		Producto1.precioventa = 0.3;
		
		boolean stock = Producto1.pedirstock();
		System.out.println(stock);
		
		
		int aumento = Producto1.aumentounidades(5);
		System.out.println(aumento);
		
		String cadenanombre = Producto.convierteACadena();
		
			
	}

}
