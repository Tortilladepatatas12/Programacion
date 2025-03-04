package ExamenDispositivos;



public class GestionDispositivos {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone("Samsung","Galaxy S21", 900);
		System.out.println(smartphone.toString());
		Laptop laptop = new Laptop("MSI","jdk2", -4);
		Laptop laptop2 = new Laptop("MSI","jdk2", 1200);
		System.out.println(laptop.toString());
		PCSobremesa pc = new PCSobremesa("Asus","232k2", 3200);
		System.out.println(pc.toString());
		System.out.println(laptop.equals(laptop2));
		
	}

}
