package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class ejercicio9 {
    
    public static void main(String[] args) {        
    
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un texto: ");
    String cadena_texto = input.nextLine();

    System.out.print("Igresa la letra que quieras, para saber cuantas veces se repite en el texto: ");
    String letra_repetida = input.nextLine();
    input.close();
    
    int contador = 0;

    for(int i =0 ; i < cadena_texto.length() ; i++){
        if (cadena_texto.substring(i, (i+1)).equalsIgnoreCase(letra_repetida)){
            contador++;
        }                 
    }
    System.out.println(String.format("La letra '%s' se repite %s veces.", letra_repetida, contador));        
    }
}
