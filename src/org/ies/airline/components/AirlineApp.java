package org.ies.airline.components;

import org.ies.airline.model.Airline;

import java.util.Scanner;

public class AirlineApp {

    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineApp(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }


    public void run(){


        //Pide los datos de la aerolínea
        Airline airline = airlineReader.read();


        //Inicia un bucle de menú con las siguientes opciones

        //Crear variable
        int option;

        do {

            // Mostrar las opciones del menú

            System.out.println("--Elige una opción--");
            System.out.println("1.Muestra todos los vuelos");
            System.out.println("2.Mostrar vuelos origen");
            System.out.println("3.Muestra los vuelos de un pasajero");
            System.out.println("4.Muestra asiento de pasajero");
            System.out.println("5.Cambiar asiento de pasajero");

            //Leer la opcion
            option = scanner.nextInt();
            scanner.nextLine();












        } while (option != 6);









    }
}
