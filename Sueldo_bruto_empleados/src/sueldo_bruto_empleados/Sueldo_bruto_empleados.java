/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo_bruto_empleados;

/**
 *
 * @author diazg
 */
public class Sueldo_bruto_empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Datos de los empleados
   String[] E = {"Empleado1", "Empleado2", "Empleado3"};
        int[] H = {40, 60, 55};
        double[] T = {10.0, 12.0, 15.0};
        
        for (int i = 0; i < E.length; i++) {
            double sueldoBruto;
            int horasNormales = H[i];
            int horasExtras = 0;
            
            // Verificar si el empleado trabajó más de 40 horas
            if (H[i] > 40) {
                horasNormales = 40;
                horasExtras = H[i] - 40;
            }
            
            // Calcular el sueldo bruto
            sueldoBruto = horasNormales * T[i] + horasExtras * (T[i] * 1.5);
            
            // Mostrar el sueldo bruto del empleado
            System.out.println(E[i] + " trabajo " + H[i] + " horas y su sueldo bruto es: $" + sueldoBruto);
        }
  
    }
}
    
