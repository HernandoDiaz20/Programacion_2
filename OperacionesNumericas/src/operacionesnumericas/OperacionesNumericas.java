/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesnumericas;

/**
 *
 * @author diazg
 */
public class OperacionesNumericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Definir las tres variables numéricas con sus valores iniciales
        int a = 10;
        int b = 7;
        int c = 2;

        // Calcular la suma, promedio, producto, cociente y modulo
        int suma = a + b + c;
        double promedio = (double) suma / 3;
        int producto = a * b * c;
        double cociente = (double) a / b;
        int modulo = a % b;

        // Mostrar los resultados en formato decimal con dos cifras significativas
        System.out.printf("Suma: %.2f\n", (double) suma);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.printf("Producto: %.2f\n", (double) producto);
        System.out.printf("Cociente: %.2f\n", cociente);
        System.out.printf("Modulo: %.2f\n", (double) modulo);
    }
    
}
