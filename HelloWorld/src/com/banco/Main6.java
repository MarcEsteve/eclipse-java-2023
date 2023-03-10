package com.banco;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        System.out.println("1 --> Gestores");
        System.out.println("2 --> Clientes");
        System.out.println("3 --> Transferencias");
        System.out.println("4 --> Mensajes");
        System.out.println("5 --> Préstamos");
        System.out.println("S --> Salir");

        while (!opcion.equals("S")) {
            System.out.println("Ingrese un número (opción):");
            opcion = scanner.nextLine();

            switch (opcion) {
            case "1":
                MostrarGestores();
                break;
            case "2":
                MostrarClientes();
                break;
            case "3":
                MostrarTransferencias();
                break;
            case "4":
                MostrarMensajes();
                break;
            case "5":
                MostrarPrestamos();
                break;
            case "S":
                System.out.println("Ha salido del programa.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
            }
        }
        scanner.close();
    }
    public static void MostrarGestores() {
        System.out.println("Ha seleccionado Gestores.");
    }
    public static void MostrarClientes() {
        System.out.println("Ha seleccionado Clientes.");
    }
    public static void MostrarTransferencias() {
        System.out.println("Ha seleccionado Transferencias.");
    }
    public static void MostrarMensajes() {
        System.out.println("Ha seleccionado Mensajes.");
    }
    public static void MostrarPrestamos() {
        System.out.println("Ha seleccionado Prestamos.");
    }

}
