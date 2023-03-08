/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Parrafo;

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
        Parrafo miParrafo = new Parrafo();
        miParrafo.setTexto("Hola, mucho gusto, mi nombre es Hernando");
        System.out.println("Numero de vocales: " + miParrafo.nVocales());
        System.out.println("Numero de consonantes: " + miParrafo.nConsonantes());
        System.out.println("Numero de simbolos: " + miParrafo.nSimbolos());
        System.out.println("Numero de repeticiones existentes de una palabra en el texto: " + miParrafo.buscar("Hola"));
        System.out.println("Vocal moda: " + miParrafo.vocalModa());
        System.out.println("Numero de palabras: " + miParrafo.nPalabras());
        miParrafo.palabraMayor();
        miParrafo.compararTexto("Hola, mucho gusto, mi nombre es Hernando");
        
        System.out.println("---------------------------------------------------------------------");
        
        Parrafo tuParrafo = new Parrafo("Estoy muy bien, me alegra saludarte");
        System.out.println("Numero de vocales: " + tuParrafo.nVocales());
        System.out.println("Numero de consonantes: " + tuParrafo.nConsonantes());
        System.out.println("Numero de simbolos: " + tuParrafo.nSimbolos());
        System.out.println("Numero de repeticiones existentes de una palabra en el texto: " + tuParrafo.buscar("bien"));
        System.out.println("Vocal moda: " + tuParrafo.vocalModa());
        System.out.println("Numero de palabras: " + tuParrafo.nPalabras());
        miParrafo.palabraMayor();
        miParrafo.compararTexto("Que has hecho ultimamente?");
    }
    
}
