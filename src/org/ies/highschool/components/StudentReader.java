package org.ies.highschool.components;
import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read() {
        System.out.println("Introduce los datos del estudiante");

        System.out.println("Introduce el nombre");
        String name = scanner.nextLine();

        System.out.println("Introduce los apellidos");
        String surname = scanner.nextLine();

        System.out.println("Introduce la dirección");
        String address = scanner.nextLine();

        Student student = new Student(
                name,
                surname,
                address
        );
        return student;
    }
}
