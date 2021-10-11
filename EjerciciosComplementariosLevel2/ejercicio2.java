// Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> ArrayListNumEnteros = new ArrayList<Integer>();

        

        System.out.println("Ingresa una lista de 5 numeros: ");
        for(int i=1; i<=5; i++){
            ArrayListNumEnteros.add(input.nextInt());

        }
        ArrayList<Integer> ArraysListaCopia = new ArrayList<>(ArrayListNumEnteros);

        System.out.println("Ingresa 1 numero al principio de la lista: ");

        ArrayListNumEnteros.add(0, input.nextInt());
        System.out.println("Ingresa 1 numero al final de la lista: ");
        ArrayListNumEnteros.add(5, input.nextInt());


        System.out.println("A continuacion se muestran los elementos de la lista originaria: ");

        for(int i = 0; i<5; i++){
            if(i!=4){

                System.out.print(ArraysListaCopia.get(i) + " - ");
            }
            else{
                System.out.print(ArraysListaCopia.get(i));
            }

        }
        System.out.println();
        System.out.println("tamaño de la lista originaria es: " + ArraysListaCopia.size());

        System.out.println("A continuacion se muestran los elementos de la lista a la cual se agregaron un numero adelante y al final: ");

        for(int i = 0; i<7; i++){
            if(i!= 6){

                System.out.print(ArrayListNumEnteros.get(i)+ " - ");
            }
            else{
                System.out.print(ArrayListNumEnteros.get(i));
            }
        }
        System.out.println();
        System.out.println("tamaño de la lista modificada es: " + ArrayListNumEnteros.size());



        








    }
    
}
