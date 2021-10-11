// 7 - Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

package EjerciciosComplementariosLevel1;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;
public class ejercicio7 {    
    public static void main(String[] args) {

        // List<String> letrasMayusculas = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));                
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un string en minusculas para convertirlo por completa en mayusculas");
        String stringMinusculas = input.nextLine();
        
        // String textoEnMayusculas = "";
        String textoEnMayusculas1 = "";
        
        for(int i =0 ; i < stringMinusculas.length() ; i++){
            if(String.valueOf((stringMinusculas.charAt(i))).equals(" ")){
                // textoEnMayusculas+= " ";                
                textoEnMayusculas1+= " ";
            }
            // Tambien funciona creando nuestra propia lista con el abecedario en mayusculas (A-Z)
            // for(int l = 0; l < letrasMayusculas.size(); l++){                
            //     if(String.valueOf((stringMinusculas.charAt(i))).equalsIgnoreCase(String.valueOf(letrasMayusculas.get(l)))){
            //         textoEnMayusculas+=letrasMayusculas.get(l);
            //     }                
            // }
            for(int c = 65; c <= 90; c++){
                String caracterConvertido = Character.toString(c);{}
                if(String.valueOf((stringMinusculas.charAt(i))).equalsIgnoreCase(caracterConvertido) || String.valueOf((stringMinusculas.charAt(i))).equalsIgnoreCase("Ñ")){
                    textoEnMayusculas1+=caracterConvertido;

                }
            }    
        }
        // System.out.println(textoEnMayusculas);
        System.out.println(textoEnMayusculas1);        
    }    
}
// import java.lang.reflect.Array;
// String [] arrayStrinMayuscula = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};