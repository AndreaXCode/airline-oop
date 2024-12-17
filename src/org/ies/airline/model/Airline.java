package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Airline {

    private String name;
    private Flight[] flights;


    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }


                  // -- MÉTODOS -- //


    // Muestra todos los vuelos

    //showFlights()
    public void showFlights(){

        if (flights != null){

            for (Flight flight: flights){

                System.out.println(flight);

            }

        } else {

            System.out.println("No hay vuelos disponibles");
        }
    }


    //showFlightsFromOrigin(String origin)
    public void showFlightsFromOrigin(String origin){

        for (Flight flight: flights){

            if (flight.getOrigin().equals(origin)){

                System.out.println("Vuelos de origen: " + flight);
            } else {

                System.out.println("No existen vuelos con ese origen");
            }
        }
    }


    //findFlight(int flightNumber): busca el vuelo y lo devuelve, si no existe devuelve null
    public Flight findFlight(int flightNumber){

        for (Flight flight: flights){

            if (flight.getFlightNumber() == flightNumber){

                return flight;

            }

        }

        return null;

    }

    //showPassengerFlights(String nif): muestra todos los vuelos donde haya un pasajero con el nif del parámetro
    public void showPassengerFlights(String nif){


        for (Flight flight: flights){

            for (Passenger passenger: flight.getPassengers()){

                if (passenger.getNif().equals(nif)){

                    System.out.println("Vuelos del pasajero con nif " + nif + " : ");
                    System.out.println(flight);

                } else {

                    System.out.println("No hay pesajeros con nif: " + nif);
                }
            }

        }
    }

    //getPassengerSeat(int flightNumber, String nif): Devuelve el asiento del pasajero en el vuelo, si no existe el vuelo o el pasajero, devuelve null
    public Integer getPassengerSeat(int flightNumber, String nif){

        //Busca el vuelo y lo devuelve

        Flight flight = findFlight(flightNumber);

        if (flight != null){

            Passenger passenger = flight.findPassenger(nif);

        }

        return null;

    }


    //updateSeatNumber(int flightNumber, String nif, int seatNumber): busca el pasajero en el vuelo, si existe le cambia el asiento.
    // Si no existe el vuelo o el pasajero muestra mensajes de error.
    public void updateSeatNumber(int flightNumber, String nif, int seatNumber){

        Scanner scanner = new Scanner(System.in);

        for (Flight flight: flights){

            for (Passenger passenger: flight.getPassengers()){

                if (passenger.getNif().equals(nif) && flight.getFlightNumber() == flightNumber && passenger.getSeatNumber() == seatNumber){

                    System.out.println("--Pasajero encontrado--");
                    System.out.print("Cambio de asiento, introduczca su nuevo asiento:");
                    int newSeat = scanner.nextInt();
                    scanner.nextLine();

                    seatNumber = newSeat;

                    System.out.println("Asiento cambiado, su nuevo asiento es el " + seatNumber);


                } else {

                    System.out.println("ERROR: No existe el vuelo o el pasajero");
                }
            }

        }
    }























    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';

    }

}


