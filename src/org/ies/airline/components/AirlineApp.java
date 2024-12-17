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


        if (option == 1){

            //Muestra todos los vuelos
            airline.showFlights();

        } else if (option == 2) {

            //Mostrar vuelos origen
            System.out.print("Por favor, introduzca su origen:");
            String origin = scanner.nextLine();

            airline.showFlightsFromOrigin(origin);

        } else if (option == 3) {

            //Muestra los vuelos de un pasajero
            System.out.print("Por favor, introduzca el nif del pasajero:");
            String nif = scanner.nextLine();

            airline.showPassengerFlights(nif);


        } else if (option == 4) {

            //Muestra asiento de pasajero
            System.out.print("Por favor, introduzca su nif:");
            String nif = scanner.nextLine();

            System.out.println("Confirme su número de vuelo");
            int flightNumber = scanner.nextInt();
            scanner.nextLine();

            airline.getPassengerSeat(flightNumber, nif);


        } else if (option == 5) {


            System.out.print("Por favor, necesito que intruduzca los siguientes datos para poder cambiar su asiento");


            System.out.print("Número de vuelo:");
            int flightNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("NIF:");
            String nif = scanner.nextLine();

            System.out.print("Asiento:");
            int seatNumber = scanner.nextInt();
            scanner.nextLine();


            airline.updateSeatNumber(flightNumber, nif, seatNumber);


        } else if (option == 6) {

            System.out.println("Saliendo del programa...");

        } else {

            System.out.println("Opción inválida");
        }


        } while (option != 6);




    }
}
