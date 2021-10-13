// 7 - Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

package EjerciciosComplementariosLevel1;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;
public class ejercicio7 {    
    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
       
        System.out.println("Ingresa un string en minusculas para convertirlo por completa en mayusculas :");
        String textoEnMinusculas = input.nextLine();
        input.close();
        String textoEnMayusculas = "";
        
        for(int i =0 ; i < textoEnMinusculas.length() ; i++){
            if(String.valueOf((textoEnMinusculas.charAt(i))).equals(" ")){        
                textoEnMayusculas+= " ";
            }
            for(int c = 65; c <= 90; c++){
                String letraMayuscula = Character.toString(c);{}
                if(String.valueOf((textoEnMinusculas.charAt(i))).equalsIgnoreCase(letraMayuscula)){
                    textoEnMayusculas += letraMayuscula;
                }
            }    
        }
        System.out.println(textoEnMayusculas);        
    }    
}
