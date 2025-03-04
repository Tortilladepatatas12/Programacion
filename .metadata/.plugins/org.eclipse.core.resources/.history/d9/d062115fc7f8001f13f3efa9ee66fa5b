package modelo;

import java.time.LocalDate;

public class CuentaBancaria {
    private float saldo;
    private LocalDate fechaApertura;
    private String iban;
    private Cliente titular;
    private Cliente autorizado;
    private static int contador;
    private int id;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        CuentaBancaria.contador = contador;
    }

    public CuentaBancaria(float saldo, int id, LocalDate fechaApertura, String iban,
                          Cliente titular, Cliente autorizado) {
        super();
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.id = contador + 1;
        this.iban = iban;
        this.titular = titular;
        this.autorizado = autorizado;
        contador = contador + 1;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", fechaApertura=" + fechaApertura
                + ", ID=" + id + ", IBAN=" + iban + ", titular=" + titular + ", autorizado=" + autorizado + "]";
    }
}
