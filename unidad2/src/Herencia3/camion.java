package Herencia3;

public class Camion extends Vehiculo {
    private int tonelajeKilos;
    private int numPasajeros;
    private int numEjes;

    // Constructor
    public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
        super(dueno, numPuertas, numRuedas);  // Llamada al constructor de la clase padre (Vehiculo)
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
    }

    public int getTonelajeKilos() {
        return tonelajeKilos;
    }

    public void setTonelajeKilos(int tonelajeKilos) {
        this.tonelajeKilos = tonelajeKilos;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
