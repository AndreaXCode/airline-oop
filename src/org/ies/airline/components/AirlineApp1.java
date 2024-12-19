package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;
import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class AirlineApp1 {

    private final Scanner scanner;
    private final AirlineReader airlineReader;


    public AirlineApp1(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }


    //Tendrá un método run() que realice los siguiente:
    public void run(){

        //Pide los datos de la aerolínea
        var airline = airlineReader.read();

        //Pide al usuario un número de vuelo
        System.out.println("Introduce su número de vuelo");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();


        //Busca el vuelo con ese número de vuelo
        var flight = airline.findFlight(flightNumber);

        //Si existe:
        if (flight != null){

            //Pide al usuario un pasajero
            System.out.println("Introduce el nif del pasajero");
            String nif = scanner.nextLine();

            //Busca a ese pasajero dentro del vuelo:
            var passenger = flight.findPassenger(nif);

            //Si existe:
            if (passenger != null){

                //Muestra los datos del pasajero
                passenger.showInfo();

                //Pide un número de asiento
                System.out.println("Introduce un número de asiento");
                int seatNumber = scanner.nextInt();
                scanner.nextLine();

                //Cambia el asiento del pasajero
                airline.updateSeatNumber(flightNumber, nif, seatNumber);

            } else {

                //Si no existe muestra un mensaje de error
                System.out.println("ERROR: No se ha encontrado ha ese pasajero");
            }


        } else {

            //Si no existe muestra un mensaje de error
            System.out.println("ERROR: No se ha encontrado el vuelo");
        }


    }


}
