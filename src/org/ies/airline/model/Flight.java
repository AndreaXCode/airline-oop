package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

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



        System.out.println("--Datos del vuelo--");

        System.out.println("Numero de vuelo: " + flightNumber);

        System.out.println("Origen: " + origin);

        System.out.println("Destino: " + destination);

        System.out.println("Puerta de embarque: " + gateNumber);


        //Pasajeros en el for
        for (Passenger passenger: passengers) {

            passenger.showInfo();

        }
    }


    public Boolean hasPassenger(String nif){

        for (Passenger passenger: passengers){


            if (passenger.getNif().equals(nif)){

                return true;
            }

        }

        return false;

    }

    //findPassenger(String nif): busca el pasajero en el vuelo y lo devuelve, si no existe devuelve null
    public Passenger findPassenger(String nif){


        for (Passenger passenger: passengers){


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



