/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costoviaje;
import java.util.Scanner;
/**
 *
 * @author diazg
 */
public class CostoViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Crear un objeto Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los datos de entrada
        System.out.print("Ingrese el numero de dias del viaje: ");
        int numDias = scanner.nextInt();
        System.out.print("Ingrese el total de kilómetros conducidos por día: ");
        double kmPorDia = scanner.nextDouble();
        System.out.print("Ingrese el costo por litro de gasolina: ");
        double costoGasolina = scanner.nextDouble();
        System.out.print("Ingrese el promedio de kilómetros por litro de gasolina: ");
        double kmPorLitro = scanner.nextDouble();
        System.out.print("Ingrese el pago por estacionamiento por día: ");
        double costoEstacionamiento = scanner.nextDouble();
        System.out.print("Ingrese el pago de peajes por día: ");
        double costoPeajes = scanner.nextDouble();

        // Calculo del costo total del viaje
        double costoGasolinaPorDia = (kmPorDia / kmPorLitro) * costoGasolina;
        double costoTotal = numDias * (costoGasolinaPorDia + costoEstacionamiento + costoPeajes);

        // Mostrar el resultado en consola
        System.out.printf("El costo total del viaje es: $%.2f\n", costoTotal);

        scanner.close();
    }
    
}
