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
                //Variable para ejercicio 3
                String nombreCliente = "";
                String tipoCanal = "", tipoCaja = "";
                String pregunta2 = "SI";
                int contadorHD = 0;
                int contadorNORM = 0;
                int subTotal = 0;
                double total = 0, impuesto = 0;

                System.out.println("Favor ingrese el nombre del cliente:");
                nombreCliente = lea.next();

                while (true) {
                    if (pregunta2.equals("SI")) {
                        System.out.println("Ingrese el tipo de canal que desea añadir HD '30 Lps.' / NORMAL '20 Lps.':");
                        tipoCanal = lea.next().toUpperCase();
                        if (tipoCanal.equals("HD") || tipoCanal.equals("NORMAL")) {
                            if (tipoCanal.equals("HD")) {
                                contadorHD++;
                                subTotal += 30;
                            }
                            if (tipoCanal.equals("NORMAL")) {
                                contadorNORM++;
                                subTotal += 20;
                            }
                        } else {
                            System.out.println("Favor ingrese un canal valido.");
                        }
                        System.out.println("Desea seguir añadiendo canales? SI/NO");
                        pregunta2 = lea.next().toUpperCase();

                    } else if (pregunta2.equals("NO")) {
                        System.out.println("---Tipos de cajas---"
                                + "\nLIGHTBOX: 50 Lps."
                                + "\nHDBOX: 100 Lps."
                                + "\nDVRBOX: 150 Lps.");
                        System.out.println("Favor ingrese el tipo de caja que desea adquirir:");
                        tipoCaja = lea.next().toUpperCase();

                        if (tipoCaja.equals("LIGHTBOX")) {
                            subTotal += 50;
                        } else if (tipoCaja.equals("HDBOX")) {
                            subTotal += 100;
                        } else if (tipoCaja.equals("DVRBOX")) {
                            subTotal += 150;
                        }

                        impuesto = subTotal * 0.15;
                        total = subTotal + impuesto;
                        System.out.println("---Factura---"
                                + "\nNombre del cliente: " + nombreCliente
                                + "\nCantidad de canales HD: " + contadorHD
                                + "\nCantidad de canales Normales: " + contadorNORM
                                + "\nSubTotal: " + subTotal
                                + "\nImpuestos: " + String.format("%.2f", impuesto)
                                + "\nTotal a pagar: " + String.format("%.2f", total));
                        break;
                    }

                }

            }
            if (opcion == 4) {
                //Variables para el ejercicio 4
                String palabra = "";
                int vocales = 0;
                char caracterActual;

                System.out.println("Favor ingrese una palabra:");
                palabra = lea.next();

                for (int contadorVocales = 0; contadorVocales < palabra.length(); contadorVocales++) {
                    caracterActual = palabra.charAt(contadorVocales);

                    switch (caracterActual) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            vocales++;

                    }
                }
                System.out.println("La cantidad de vocales son: " + vocales + ".");

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
