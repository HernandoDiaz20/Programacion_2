/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programavariable;

/**
 *
 * @author diazg
 */
public class ProgramaVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int x = 10; // DDefini la variable x como un entero y le asigne el valor de 10

        // Mostrar el valor de x
        System.out.printf("x = %d\n", x);

        // Mostrar el resultado de x + x
        System.out.printf("El valor de %d + %d es %d\n", x, x, (x + x));

        // Mostrar el resultado de x / 2 con dos decimales
        System.out.printf("El valor de %d / 2 = %.2f\n", x, (float) x / 2);

        // Mostrar el resultado de x % 3
        System.out.printf("El valor de %d mod 3 = %d\n", x, x % 3);
    }
}
