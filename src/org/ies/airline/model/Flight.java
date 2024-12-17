package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private int gateNumber;
    private Passenger[] passengers;


    public Flight(int flightNumber, String origin, String destination, int gateNumber, Passenger[] passengers) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.gateNumber = gateNumber;
        this.passengers = passengers;
    }

    public void showInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Datos del vuelo--");

        System.out.print("Numero de vuelo:");
        int flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Origen:");
        String origin = scanner.nextLine();

        System.out.print("Destino:");
        String destination = scanner.nextLine();

        System.out.print("Puerta de embarque:");
        int gateNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pasajeros:");


        for (Passenger passenger: passengers) {

            passenger.showInfo();

        }
    }


    public Boolean hasPassenger(String nif){

        for (Passenger passenger: passengers){

            boolean found = true;

            if (passenger.getNif().equals(nif)){

                return true;
            }

        }

        return false;

    }

    public Passenger findPassenger(String nif){



        for (Passenger passenger = passengers){


            if (passenger.getNif().equals(nif)){

                return passenger;
            }
        }

        return null;
    }






    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight passenger = (Flight) o;
        return flightNumber == passenger.flightNumber && gateNumber == passenger.gateNumber && Objects.equals(origin, passenger.origin) && Objects.equals(destination, passenger.destination) && Objects.deepEquals(passengers, passenger.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, origin, destination, gateNumber, Arrays.hashCode(passengers));
    }




}



