/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        double costoFijo = 25;
        int diaPago;
        double descuento = 0.05;
        double valorDes;
        double total;

        System.out.println("Ingrse su nombre");
            nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine();
        System.out.println("Ingrse su usuario");
            usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
            parroquia = entrada.nextLine();
        
        System.out.println("Ingrese su dia de Pago");
            diaPago = entrada.nextInt();

        if ((parroquia.equals("El Valle") || (parroquia.equals("El Sagrario")))
                && (diaPago < 10)) {
            valorDes = costoFijo * descuento;
            total = costoFijo - valorDes;
            System.out.printf("Gym Fuerza Total\n"
                    + "Factura mensual:\n"
                    + "Nombre: %s %s\n"
                    + "Usiario: %s\n"
                    + "Edad: %s\n"
                    + "Parroquia: %s\n"
                    + "Dia de Pago: %s\n"
                    + "Subtotal: %.2f\n"
                    + "Descuento: %.2f\n"
                    + "Total a Pagar: %.2f\n",
                    nombre,
                    apellido,
                    usuario,
                    edad,
                    parroquia,
                    diaPago,
                    costoFijo,
                    valorDes,
                    total);
        } else {
            System.out.printf("Gym Fuerza Total\n"
                    + "Factura mensual:\n"
                    + "Nombre: %s %s\n"
                    + "Usiario: %s\n"
                    + "Edad: %s\n"
                    + "Parroquia: %s\n"
                    + "Dia de Pago: %s\n"
                    + "Subtotal: %.2f\n"
                    + "Descuento: $ 0,00\n"
                    + "Total a Pagar: %.2f\n",
                    nombre,
                    apellido,
                    usuario,
                    edad,
                    parroquia,
                    diaPago,
                    costoFijo,
                    costoFijo);
        }

    }
}


