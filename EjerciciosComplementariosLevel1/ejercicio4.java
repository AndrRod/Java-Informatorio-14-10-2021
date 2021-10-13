//4. Realizar un programa que calcule el factorial de un número: n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String args[]){        
        Scanner entrada = new Scanner(System.in);
                
        System.out.print("ingrese un numero para calcular su factorial: ");

        int numero = entrada.nextInt();
        entrada.close();
        
        int resultado = 1;
                
        for( int i = numero; i > 0; i--){
            resultado = resultado*i;            
        }
        System.out.println("El factorial de " + numero + " es: " + resultado);    
    }
}
