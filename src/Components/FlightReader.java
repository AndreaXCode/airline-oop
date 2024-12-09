package Components;

import model.Flight;
import model.Passenger;

import java.util.Scanner;

public class FlightReader {

    private final Scanner scanner;

    public FlightReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Passenger read(){

        System.out.println("--Datos del vuelo--");

        System.out.println("NIF:");
        String nif = scanner.nextLine();

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Apellido:");
        String surname = scanner.nextLine();

        System.out.println("Número de asiento");
        Integer seatNumber = scanner.nextInt();
        scanner.nextLine();

        return new Flight(

                nif,
                name,
                surname,
                seatNumber

        );




    }
}
