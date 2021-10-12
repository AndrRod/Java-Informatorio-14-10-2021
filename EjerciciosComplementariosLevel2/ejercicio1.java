//1.  Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ejercicio1 {    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);             
        
        System.out.print("Ingrese la cantidad de ciudades a ingresar: ");
        int cantidad = input.nextInt();
        ArrayList<String> ciudadesFavoritas = new ArrayList<String>();
        
        // si no se incorpora nexLine() hace un salteo que todavía no logro comprender porque
        input.nextLine();
        
        for(int i = 1; i<= cantidad; i++){
            System.out.print("Ingrese " + i + "° " + "ciudad favorita: ");
            ciudadesFavoritas.add("#" + i + " - " + input.nextLine());
        }

        System.out.println();
        System.out.println("Ciudades favoritas: ");

        Iterator<String> iterarCiudadesFavoritas = ciudadesFavoritas.iterator();
            while(iterarCiudadesFavoritas.hasNext()){
                String ciudad = iterarCiudadesFavoritas.next();
                System.out.println(ciudad);
            }
        // o tambien
        // for(int i= 0; i< cantidad; i++){
        //     System.out.println(ciudadesFavoritas.get(i));
        // }
    }
}
