// 3. Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero, para imprimir la secuencia de numeros incrementados de a 1: ");
        int numero = input.nextInt();         
               
        input.close();
        int[] lista = new int[numero];
               
        int contador = 0;
        for(int i = 1; i<(numero+1); i++){
            lista[contador] = i;            
            for(int j = 0; j < numero ; j++){
                if(lista[j] != 0){    
                    System.out.print(lista[j]+" ");
                }
            }
            System.out.println();
            contador++;
        }
    }    
}
