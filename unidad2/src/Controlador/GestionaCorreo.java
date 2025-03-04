package Controlador;

import java.util.Scanner;
import modelo.CorreoElectronico;

public class GestionaCorreo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean activo = true;
        int cantidadCorreos = 0;
        CorreoElectronico[] listaCorreos = new CorreoElectronico[5];

        while (activo) {
            System.out.println("Introduce un correo electrónico: ");
            String email = entrada.next();

            if (CorreoElectronico.esCorreoValido(email)) {
                CorreoElectronico nuevoCorreo = new CorreoElectronico(email);
                listaCorreos[cantidadCorreos] = nuevoCorreo;
                cantidadCorreos++;
                System.out.println("Correo válido registrado.");
            } else {
                System.out.println("Correo no válido.");
            }

            if (cantidadCorreos == 5) {
                activo = false;
            }
        }

        for (CorreoElectronico emailGuardado : listaCorreos) {
            System.out.println(emailGuardado);
        }
    }
}
