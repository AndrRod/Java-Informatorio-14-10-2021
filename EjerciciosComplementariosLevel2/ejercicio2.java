// Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arrayListNumEnteros = new ArrayList<Integer>();        

        System.out.println("Ingresa una lista de 5 numeros: ");
        for(int i=1; i<=5; i++){
            arrayListNumEnteros.add(input.nextInt());
        }
        
        ArrayList<Integer> CopiaListaOriginaria = new ArrayList<>(arrayListNumEnteros);

        System.out.println("Ingresa 1 numero al principio de la lista: ");

        arrayListNumEnteros.add(0, input.nextInt());
        System.out.println("Ingresa 1 numero al final de la lista: ");
        arrayListNumEnteros.add(6, input.nextInt());       
        
        input.close();
        
        System.out.println("\nA continuacion se muestran los elementos de la lista originaria: ");

        for(int i = 0; i<5; i++){
            if(i!=4){
                System.out.print(CopiaListaOriginaria.get(i) + " - ");
            }
            else{
                System.out.print(CopiaListaOriginaria.get(i));
            }
        }

        System.out.println("\nCantidad de numeros en la lista originaria es: " + CopiaListaOriginaria.size());

        System.out.println("\nA continuacion se muestran los elementos de la lista a la cual se agregaron un numero adelante y al final: ");

        for(int i = 0; i<7; i++){
            if(i!= 6){
                System.out.print(arrayListNumEnteros.get(i)+ " - ");
            }
            else{
                System.out.print(arrayListNumEnteros.get(i));
            }
        }    
        System.out.println("\nCantidad de numeros en la lista modificada es: " + arrayListNumEnteros.size());
    }
    
}
