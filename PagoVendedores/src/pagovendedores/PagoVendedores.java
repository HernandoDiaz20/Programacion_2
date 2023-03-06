/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagovendedores;
import java.util.Scanner;
/**
 *
 * @author diazg
 */
public class PagoVendedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        // Solicitar datos del vendedor
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la categoria del vendedor (A o B): ");
        char categoria = sc.nextLine().charAt(0);

        int[] ventas = new int[7];
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese las ventas del dia " + (i+1) + ": ");
            ventas[i] = sc.nextInt();
        }

        // Calcular el pago semanal sin incremento por categoría
        double pagoSemanal = 200.0;
        for (int venta : ventas) {
            pagoSemanal += venta * 0.09;
        }

        // Calcular el incremento por categoría
        double incremento = 0.0;
        switch (categoria) {
            case 'A' -> {
                int totalVentasA = 0;
                for (int venta : ventas) {
                    totalVentasA += venta;
                }
                if (totalVentasA > 7000) {
                    incremento = 0.1;
                } else if (totalVentasA >= 5000) {
                    incremento = 0.07;
                } else if (totalVentasA >= 3000) {
                    incremento = 0.05;
                }
            }
            case 'B' -> {
                int totalVentasB = 0;
                for (int venta : ventas) {
                    totalVentasB += venta;
                }
                if (totalVentasB > 15000) {
                    incremento = 0.13;
                } else if (totalVentasB >= 10000) {
                    incremento = 0.1;
                } else if (totalVentasB >= 5000) {
                    incremento = 0.07;
                }
            }
            default -> {
                System.out.println("Categoría inválida");
                System.exit(0);
            }
        }

        // Calcular el pago semanal con incremento por categoría
        double pagoSemanalConIncremento = pagoSemanal * (1.0 + incremento);

        // Mostrar resultados por pantalla
        System.out.println("El pago semanal para el vendedor " + nombre + " es: $" + pagoSemanal);
        System.out.println("El incremento por categoria es: " + (incremento*100) + "%");
        System.out.println("El pago semanal con incremento por categoria es: $" + pagoSemanalConIncremento);

        sc.close();
    }
    
}
