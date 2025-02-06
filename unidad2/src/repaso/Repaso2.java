package repaso;

public class Repaso2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String cadena = "hello planet earth, a great planet. ";
        String cadena2 = cadena.replaceAll("et", "ET");
        String cadena3 = cadena.replace("et", "ET");
        
        System.out.println(cadena);
        System.out.println(cadena2);
        System.out.println(cadena3);
        
        Repaso2 r = new Repaso2 ();
        String cargacadenaminusculas = "HOLA";
        String minusculas = cargacadenaminusculas.toLowerCase();
        System.out.println(minusculas);
    }
}
