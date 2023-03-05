/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informeventas;

/**
 *
 * @author diazg
 */
public class InformeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Definición de los arreglos de datos
        int[] codigos = {1, 2, 3, 4, 5}; // Código de los productos vendidos
        double[] valores = {10.50, 5.25, 8.00, 12.75, 6.50}; // Valor de venta de cada producto
        int[] cantidades = {20, 10, 15, 8, 25}; // Cantidad de unidades vendidas de cada producto

        // Cálculo del total de productos vendidos en el día
        int totalProductosVendidos = 0;
        for (int cantidad : cantidades) {
            totalProductosVendidos += cantidad;
        }

        // Cálculo del total de ingresos por ventas del día
        double totalIngresosVentas = 0;
        for (int i = 0; i < valores.length; i++) {
            totalIngresosVentas += valores[i] * cantidades[i];
        }

        // Cálculo del producto más vendido
        int productoMasVendido = codigos[0];
        int cantidadMasVendida = cantidades[0];
        for (int i = 1; i < codigos.length; i++) {
            if (cantidades[i] > cantidadMasVendida) {
                productoMasVendido = codigos[i];
                cantidadMasVendida = cantidades[i];
            }
        }

        // Cálculo del producto más costoso vendido
        int productoMasCostoso = codigos[0];
        double valorMasCostoso = valores[0];
        for (int i = 1; i < codigos.length; i++) {
            if (valores[i] > valorMasCostoso) {
                productoMasCostoso = codigos[i];
                valorMasCostoso = valores[i];
            }
        }

        // Impresión de los resultados
        System.out.println("Total de productos vendidos: " + totalProductosVendidos);
        System.out.println("Total de ingresos por ventas del dia: " + totalIngresosVentas);
        System.out.println("Producto mas vendido: " + productoMasVendido);
        System.out.println("Producto mas costoso vendido: " + productoMasCostoso);
    }
}
