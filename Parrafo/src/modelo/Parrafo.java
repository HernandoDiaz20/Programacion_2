/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author diazg
 */
public class Parrafo {
    private String texto;

    public Parrafo() {
        this.texto = "";
    }

    public Parrafo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int nVocales() {
        String textoLower = texto.toLowerCase();
        int count = 0;
        for (int i = 0; i < textoLower.length(); i++) {
            char c = textoLower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public int nConsonantes() {
        String textoLower = texto.toLowerCase();
        int count = 0;
        for (int i = 0; i < textoLower.length(); i++) {
            char c = textoLower.charAt(i);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }
        return count;
    }

    public int nSimbolos() {
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                count++;
            }
        }
        return count;
    }

    public int buscar(String palabra) {
        int count = 0;
        int index = texto.indexOf(palabra);
        while (index != -1) {
            count++;
            index = texto.indexOf(palabra, index + 1);
        }
        return count;
    }

    public char vocalModa() {
        String textoLower = texto.toLowerCase();
        int[] count = new int[5];
        for (int i = 0; i < textoLower.length(); i++) {
            char c = textoLower.charAt(i);
            if (c == 'a') {
                count[0]++;
            } else if (c == 'e') {
                count[1]++;
            } else if (c == 'i') {
                count[2]++;
            } else if (c == 'o') {
                count[3]++;
            } else if (c == 'u') {
                count[4]++;
            }
        }
        int maxCount = 0;
        char moda = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                if (i == 0) {
                    moda = 'a';
                } else if (i == 1) {
                    moda = 'e';
                } else if (i == 2) {
                    moda = 'i';
                } else if (i == 3) {
                    moda = 'o';
                } else if (i == 4) {
                    moda = 'u';
                }
            }
        }
        return moda;
    }

    public int nPalabras() {
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }

    public void palabraMayor() {
        String[] palabras = texto.split("\\s+");
        String palabraMayor = "";
        int tamanoMayor = 0;
        for (String palabra : palabras) {
            int tamano = palabra.length();
            if (tamano > tamanoMayor) {
                tamanoMayor = tamano;
                palabraMayor = palabra;
            }
        }
        System.out.println("La palabra mas larga es \"" + palabraMayor + "\" con " + tamanoMayor + " caracteres.");
    }

    public void compararTexto(String txt) {
        if (texto.equals(txt)) {
            System.out.println("Los textos son iguales.");
        } else {
            System.out.println("Los textos son diferentes.");
        }
    }
}
   
  