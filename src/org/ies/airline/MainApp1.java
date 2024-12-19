package org.ies.airline;

import org.ies.airline.components.*;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);

        AirlineApp1 airlineApp1 = new AirlineApp1(scanner, airlineReader);

        airlineApp1.run();

    }
}