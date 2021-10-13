// 3 - Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
// Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso
package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        
        List<String> listaCartas = new ArrayList<String>(Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"));
        
        List<String> listaCartasInvertidas = new ArrayList<>(listaCartas);
        Collections.reverse(listaCartasInvertidas);
        
        List<String> listaCartasDesordenadas = new ArrayList<>(listaCartas);
        Collections.shuffle(listaCartasDesordenadas);

        System.out.print("\nCartas en orden: \t\t");
        for(int i=0; i< listaCartas.size(); i++){
           System.out.print(listaCartas.get(i) + " ");
        }
        System.out.print("\nCartas en orden inverso: \t");
        for(int i=0; i< listaCartas.size(); i++){
            System.out.print(listaCartasInvertidas.get(i) + " ");
        }
        System.out.print("\ncartas desordenadas: \t\t");
        for(int i=0; i< listaCartas.size(); i++){
            System.out.print(listaCartasDesordenadas.get(i) + " ");
        }
    }    
}
