/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author diazg
 */
public class Ruta {
  private String origen;
  private String destino;
  private double distancia;
  private double costoPorKm;

  public Ruta(String origen, String destino, double distancia, double costoPorKm) {
    this.origen = origen;
    this.destino = destino;
    this.distancia = distancia;
    this.costoPorKm = costoPorKm;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }

  public double getDistancia() {
    return distancia;
  }

  public double getCostoPorKm() {
    return costoPorKm;
  }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCostoPorKm(double costoPorKm) {
        this.costoPorKm = costoPorKm;
    }
}