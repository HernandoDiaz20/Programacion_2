/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author diazg
 */
public class EmpresaTransportadora {
  private String nombreEmpresa;
  private List<Cliente> clientes;
  private List<Ruta> rutas;

  public EmpresaTransportadora(List<Cliente> clientes, List<Ruta> rutas, String nombreEmpresa) {
    this.clientes = clientes;
    this.rutas = rutas;
    this.nombreEmpresa = nombreEmpresa;
  }

  public double calcularCostoRuta(Ruta ruta) {
    return ruta.getDistancia() * ruta.getCostoPorKm();
  }

  public Ruta obtenerRutaMasRentable(Pedido pedido) {
    Ruta rutaMasRentable = null;
    double costoMasBajo = Double.MAX_VALUE;
    for (Ruta ruta : rutas) {
      if (ruta.getOrigen().equals(pedido.getOrigen()) && ruta.getDestino().equals(pedido.getDestino())) {
        double costoRuta = calcularCostoRuta(ruta);
        if (costoRuta < costoMasBajo) {
          costoMasBajo = costoRuta;
          rutaMasRentable = ruta;
        }
      }
    }

    return rutaMasRentable;
  } 
}

