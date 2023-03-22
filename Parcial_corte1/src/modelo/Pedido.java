/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author diazg
 */
public class Pedido {
  private Cliente cliente;
  private String origen;
  private String destino;
  private double peso;

  public Pedido(Cliente cliente, String origen, String destino, double peso) {
    this.cliente = cliente;
    this.origen = origen;
    this.destino = destino;
    this.peso = peso;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }

  public double getPeso() {
    return peso;
  }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
