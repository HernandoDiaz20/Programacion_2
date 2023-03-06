/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limit_de_credito1;
import java.util.Scanner;
/**
 *
 * @author diazg
 */
public class Limit_de_credito1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        // Solicitar datos del cliente
        System.out.print("Ingrese el saldo al inicio del mes: ");
        int saldoInicial = sc.nextInt();

        System.out.print("Ingrese el total de abonos en el mes: ");
        int abonos = sc.nextInt();

        System.out.print("Ingrese el total de deducciones aplicadas a la cuenta del cliente en el mes: ");
        int deducciones = sc.nextInt();

        System.out.print("Ingrese el limite de credito permitido: ");
        int limiteCredito = sc.nextInt();

        // Calcular el nuevo saldo
        int nuevoSaldo = saldoInicial + abonos - deducciones;

        // Mostrar el nuevo balance
        System.out.println("El nuevo saldo es: " + nuevoSaldo);

        // Verificar si se excedió el límite de crédito
        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }
         else {
                    System.out.println("No se excedio el limite de su credito");
                    }

        sc.close();
    }
    
}
