package ar.edu.unju.escmi.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {

            option = -1;

            System.out.println("\nMenu Principal");
            System.out.println("1- Realizar una venta");
            System.out.println("2- Revisar compras realizadas por el cliente (debe ingresar el DNI del cliente)");
            System.out.println("3- Mostrar lista de los electrodomesticos");
            System.out.println("4- Consultar stock");
            System.out.println("5- Salir");

            System.out.println("Ingrese su opcion: ");

            option = scanner.nextInt();

            if (option == 1) {

            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {

                System.out.println("\nHa salido correctamente del programa");
                break;

            } else
                System.out.println("\nOpcion incorrecta");

        } while (1 == 1);

        scanner.close();
    }
}