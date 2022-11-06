package ar.edu.unju.escmi.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {

            option = -1;

            System.out.println("\nMenu Principal");
            System.out.println("1- Ingresar");
            System.out.println("2- Salir");

            System.out.println("Ingrese su opcion: ");

            option = scanner.nextInt();

            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else
                System.out.println("\nOpcion incorrecta");

        } while (1 == 1);
    }
}