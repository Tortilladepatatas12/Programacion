package Controlador;

import modelo.ConversorAlReves;
import modelo.Conversor;

public class ConversionPrincipal {

    public static void main(String[] args) {
        Conversor tipoConv = new Conversor(150);
        System.out.println(tipoConv.convertirEurosADolares(tipoConv));
        
        ConversorAlReves tipoConvInverso = new ConversorAlReves(150);
        System.out.println(tipoConvInverso.convertirDolaresAEuros(tipoConvInverso));
    }
}
