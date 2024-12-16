package org.ies.airline.model;

import java.util.Objects;
import java.util.Scanner;

public class Passenger {


    private String nif;
    private String name;
    private  String surname;
    private Integer seatNumber;


    public Passenger(String nif, String name, String surname, Integer seatNumber) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seatNumber = seatNumber;
    }

    public void showInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Datos del pasajero--");

        System.out.print("NIF:");
        String nif = scanner.nextLine();

        System.out.print("Nombre:");
        String name = scanner.nextLine();

        System.out.print("Apellido:");
        String surname = scanner.nextLine();

        System.out.print("NIF:");
        String seatNumber = scanner.nextLine();


    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger flight = (Passenger) o;
        return Objects.equals(nif, flight.nif) && Objects.equals(name, flight.name) && Objects.equals(surname, flight.surname) && Objects.equals(seatNumber, flight.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, seatNumber);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}

