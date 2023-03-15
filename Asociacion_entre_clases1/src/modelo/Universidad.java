/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author diazg
 */
public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
}
