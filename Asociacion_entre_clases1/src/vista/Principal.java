/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Estudiante;
import modelo.Universidad;
/**
 *
 * @author diazg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Hernando", 18);
        Estudiante estudiante2 = new Estudiante("Laura", 22);
        Estudiante estudiante3 = new Estudiante("Andres", 19);
        Estudiante estudiante4 = new Estudiante("Ana", 21);
        
        Universidad universidad = new Universidad("Universidad Popular del Cesar");
        
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);
        universidad.agregarEstudiante(estudiante3);
        universidad.agregarEstudiante(estudiante4);
        
        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Estudiantes: ");
        
        for (Estudiante estudiante : universidad.getEstudiantes()) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getEdad() + " anios");
        }
    }
}