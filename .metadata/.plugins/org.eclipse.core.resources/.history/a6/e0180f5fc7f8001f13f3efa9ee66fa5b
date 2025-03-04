package modelo;

public class Conversor {
    private float cantidadEuros;
    public final static float TASA_CAMBIO = 0.96f;

    @Override
    public String toString() {
        return "Conversor [cantidadEuros=" + cantidadEuros + ", tasaCambio=" + TASA_CAMBIO + "]";
    }

    public Conversor(float cantidadEuros) {
        super();
        this.cantidadEuros = cantidadEuros;
    }

    public static float convertirEurosADolares(Conversor conversor) {
        if (conversor.cantidadEuros > 0) {
            return conversor.cantidadEuros * TASA_CAMBIO;
        } else {
            System.out.println("No vale esta cantidad");
            return 0;
        }
    }
}