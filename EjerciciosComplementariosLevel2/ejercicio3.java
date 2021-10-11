// 3 - Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
// Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso


package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        
        // creacion de lista vacia
        // List<String> lista_cartas = new ArrayList<String>(); 
        // lista_cartas.add("a");
        // System.out.println(lista_cartas);

        List<String> listaCartas = new ArrayList<String>(){
            {
             add("A");
             add("1");
             add("2");
             add("3");
             add("4");
             add("5");
             add("6");
             add("7");
             add("8");
             add("9");
             add("J");
             add("Q");
             add("K");
            }

        };
        List<String> listaCartasInvertidas = new ArrayList<>(listaCartas);
        Collections.reverse(listaCartasInvertidas);
        
        List<String> listaCartasDesordenadas = new ArrayList<>(listaCartas);
        Collections.shuffle(listaCartasDesordenadas);

        System.out.println("cartas en orden comun: ");
        System.out.println(listaCartas);
        System.out.println("cartas en orden invertida");
        System.out.println(listaCartasInvertidas);
        System.out.println("cartas mezcladas");
        System.out.println(listaCartasDesordenadas);
    }
    
}
