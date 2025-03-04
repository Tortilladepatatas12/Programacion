package modelo;

public class ConversorAlReves {
    private float cantidadDolares;
    public final static float TASA_EUROS = 1 / 0.96f;
    
    @Override
    public String toString() {
        return "ConversorAlReves [cantidadDolares=" + cantidadDolares + "]";
    }

    public ConversorAlReves(float cantidadDolares) {
        super();
        this.cantidadDolares = cantidadDolares;
    }
    
    public static float convertirDolaresAEuros(ConversorAlReves conversor) {
        if (conversor.cantidadDolares > 0) {
            return conversor.cantidadDolares * TASA_EUROS;
        } else {
            System.out.println("Cantidad no válida");
            return 0;
        }
    }
}