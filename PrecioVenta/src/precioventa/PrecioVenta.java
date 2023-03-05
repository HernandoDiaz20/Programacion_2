/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precioventa;

/**
 *
 * @author diazg
 */
public class PrecioVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Definir e inicializar los valores de costo fijo, porcentaje de iva y porcentaje de utilidad
        int costoFijo = 100;
        double porcentajeIva = 0.12;
        double porcentajeUtilidad = 0.25;

        // Calcular el precio de venta
        double precioVenta = costoFijo * (1 + porcentajeIva) * (1 + porcentajeUtilidad);

        // Mostrar el precio de venta
        System.out.printf("El precio de venta es: $%.2f\n", precioVenta);
    }
    
}
