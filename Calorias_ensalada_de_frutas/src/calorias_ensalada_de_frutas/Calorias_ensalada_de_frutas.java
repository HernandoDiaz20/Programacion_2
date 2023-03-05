/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calorias_ensalada_de_frutas;

/**
 *
 * @author diazg
 */
public class Calorias_ensalada_de_frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definir e iniciar las variables de las frutas de la ensalada
        int manzanas = 2;
        int peras = 3;
        int naranjas = 1;
        int melones = 1;
       
        //Definir e inicializar las variable con el valor de las calorias correspondientes
        int caloriasManzana = 52;
        int caloriasPera = 55;
        int caloriasNaranja = 45;
        int caloriasMelon = 54;

        int totalCalorias = (manzanas * caloriasManzana) + (peras * caloriasPera) + (naranjas * caloriasNaranja) + (melones * caloriasMelon);

        System.out.println("La ensalada de frutas tiene " + totalCalorias + " calorias.");
    }
}