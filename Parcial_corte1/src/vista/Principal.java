/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.*;

/**
 *
 * @author diazg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Cliente cliente1 = new Cliente("Hernando Diaz", "Calle 123");
    Cliente cliente2 = new Cliente("Ana Lopez", "Avenida 456");

    Ruta ruta1 = new Ruta("Valledupar", "Medellin", 745, 2.500);
    Ruta ruta2 = new Ruta("Bogota", "Valledupar", 870, 4.000);
    Ruta ruta3 = new Ruta("Bosconia", "Barranquilla", 210, 1.500);

    List<Cliente> clientes = new ArrayList<>();
    clientes.add(cliente1);
    clientes.add(cliente2);

    List<Ruta> rutas = new ArrayList<>();
    rutas.add(ruta1);
    rutas.add(ruta2);
    rutas.add(ruta3);

    EmpresaTransportadora empresa = new EmpresaTransportadora(clientes, rutas, "Envios Xpress");

    Pedido pedido = new Pedido(cliente1, "Valledupar", "Medellin", 20);

    Ruta rutaMasRentable = empresa.obtenerRutaMasRentable(pedido);
    
    System.out.println("                                *** Envios Xpress ***                                 ");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println("La ruta mas rentable para el pedido es de " + rutaMasRentable.getDistancia() + " km y tiene un costo de " + empresa.calcularCostoRuta(rutaMasRentable) + " pesos.");
  }
}
