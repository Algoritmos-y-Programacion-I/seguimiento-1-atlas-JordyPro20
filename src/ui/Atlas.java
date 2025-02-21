package ui;

import java.util.Scanner;

public class Atlas {

    private Scanner escaner;

    // Declaración de constantes
    final double COSTO_TRAYECTO_AVION = 250000;
    final double P_NOCHE = 150000;

    private Atlas() {
        escaner = new Scanner(System.in);
    }

    public void run() {   
        // Saludo
        System.out.println("|| Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y Programación I de la Universidad ICESI.");
        
        // Pedir información al usuario
        System.out.println("|| Para mejor experiencia, danos tu nombre:");
        String nombre = escaner.nextLine();
        System.out.println("|| Bienvenido " + nombre + "!");

        System.out.println("|| ¿Cuál es tu edad actual?");
        int edad = escaner.nextInt();

        System.out.println("|| Por favor, danos tu número de documento:");
        int documento = escaner.nextInt();

        escaner.nextLine(); // Consumir la nueva línea pendiente
        System.out.println("|| ¿Desde qué ciudad estás cotizando el viaje?");
        String ciudad = escaner.nextLine();

        System.out.println("|| Bienvenido " + nombre + ", a EVENTOS ATLAS. Para empezar, ¿cuántas noches deseas hospedarte?");
        int noches = escaner.nextInt();

        // Cálculo de costos
        double totalTransporte = calcularTotalTransporte(COSTO_TRAYECTO_AVION, noches, P_NOCHE);

        // Imprimir factura
        System.out.println("\n||--------------- FACTURA DE VIAJE ---------------||");
        System.out.println("|| Tiquetes de avión " + ciudad + " - Bogotá - " + ciudad + ", por un total de $" + totalTransporte);
        System.out.println("|| A nombre de: " + nombre);
        System.out.println("|| Edad: " + edad);
        System.out.println("|| Documento: " + documento);
        System.out.println("||------------------------------------------------||");
    }

    public static void main(String[] args) {
        Atlas mainApp = new Atlas();
        mainApp.run();
    }

    public double calcularTotalTransporte(double costoTrayecto, int noches, double costoNoche) {
        return (noches * costoNoche) + (2 * costoTrayecto);
    }
}
