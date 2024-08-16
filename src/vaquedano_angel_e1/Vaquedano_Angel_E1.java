/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_e1;

import java.util.Scanner;

import java.util.InputMismatchException;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        //Variables para el menú.
        int opcion = 0;

        while (true) {
            System.out.println("\n-----Menu-----"
                    + "\n1. Piramide"
                    + "\n2. El Mayor"
                    + "\n3. Ventas de cajas."
                    + "\n4. Caracteres Vocales");
            System.out.println("Favor ingrese la opcion que desea realizar: ");

            try {
                opcion = lea.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Favor ingrese un caracter valido.");
                lea.nextLine();
            }
            if (opcion == 1) {

                //Variables para el ejercicio 1.
                int lineas = 0;
                int numeroImpar = 1;

                while (true) {
                    System.out.println("Bienvenido al ejercicio PIRAMIDE!");
                    System.out.println("Favor ingrese la cantidad de lineas que desea que la piramide tenga:");
                    lineas = lea.nextInt();

                    if (lineas > 1) {
                        for (int contadorLinea1 = 1; contadorLinea1 <= lineas; contadorLinea1++) {
                            int suma = 0;
                            for (int contadorLinea2 = 1; contadorLinea2 <= contadorLinea1; contadorLinea2++) {
                                System.out.print(numeroImpar + " ");
                                suma += numeroImpar;
                                numeroImpar += 2;
                            }
                            System.out.println("= " + (contadorLinea1 * contadorLinea1 * contadorLinea1));
                        }
                    } else if (lineas <= 0) {
                        System.out.println("Favor ingrese un numero positivo mayor a 0.");
                    }
                    break;
                }

            }
            if (opcion == 2) {
                //Variables para el ejercicio 2.
                int numeroInt = 0;
                String pregunta = "SI";
                int contadorNum = 0;
                double promedio = 0;
                int sumaTotal = 0;
                int numeroMayor = 0;

                while (true) {
                    if (pregunta.equals("SI")) {
                        System.out.println("Favor ingrese un numero entero:");
                        numeroInt = lea.nextInt();
                        contadorNum++;
                        sumaTotal += numeroInt;
                        if (numeroInt > numeroMayor) {
                            numeroMayor = numeroInt;
                        }

                        System.out.println("Quieres seguir ingresando numeros?");
                        pregunta = lea.next().toUpperCase();

                    } else if (pregunta.equals("NO")) {
                        promedio = sumaTotal / contadorNum++;
                        System.out.println("El promedio de numeros es: " + promedio
                                + "\nEl numero mayor fue: " + numeroMayor);
                        break;
                    }
                }

            }
            if (opcion == 3) {
                
            }
            if (opcion == 4) {
                
            }
            if (opcion == 5) {
                System.out.println("HASTA LUEGO");
                System.exit(0);
            } else if (opcion > 5) {
                System.out.println("Favor ingrese un numero valido.");
            }
        }
    }
}
