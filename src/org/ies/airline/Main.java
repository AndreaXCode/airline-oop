package org.ies.airline;

import org.ies.airline.components.AirlineApp;
import org.ies.airline.components.AirlineReader;
import org.ies.airline.components.FlightReader;
import org.ies.airline.components.PassengerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);

        AirlineApp airlineApp = new AirlineApp(scanner, airlineReader);

        airlineApp.run();

    }
}