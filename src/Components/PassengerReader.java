package Components;

import model.Passenger;

import java.util.Scanner;

public class PassengerReader {


    private final Scanner scanner;
    private final FlightReader flightReader;



    public PassengerReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }


    public Passenger read(){


        System.out.println("--Datos del pasajero--");

        System.out.println("Número de vuelo:");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Origen:");
        String origin = scanner.nextLine();

        System.out.println("Destino:");
        String destination = scanner.nextLine();

        System.out.println("Puerta de embarque:");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();


        System.out.println("¿Cuantos pasajeros hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Passenger[] passenger = new Passenger[size];

        for (int i = 0; i < size; i++) {

            passenger[i] = flightReader.read();


        }

        return new Passenger(


                flightNumber,
                origin,
                destination,
                gateNumber,
                passenger
        );



    }
}
