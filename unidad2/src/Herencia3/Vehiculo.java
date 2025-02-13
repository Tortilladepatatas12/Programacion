package Herencia3;

public class Automovil extends Vehiculo {
    private String calificacionEcologica;

    // Constructor
    public Automovil(String dueno, int numPuertas, int numRuedas, String calificacionEcologica) {
        super(dueno, numPuertas, numRuedas);  // Llamada al constructor de la clase padre (Vehiculo)
        this.calificacionEcologica = calificacionEcologica;
    }

    // Métodos getter y setter
    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }
}
