//1.  Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ejercicio1 {    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);             
        
        System.out.print("Ingrese el numero de ciudades a ingresar: ");
        String cantidad = input.nextLine();
        ArrayList<String> ciudadesFavoritas = new ArrayList<String>();
        
        // si no se incorpora nexLine() cuando hago uso de nexInt hace un salto de linea que todavía no logro comprender porque lo hace
        // no usar nexline y nexint en el mismo procedimiento
        // input.nextLine();
        
        for(int i = 1; i<= Integer.parseInt(cantidad); i++){
            System.out.print("Ingrese " + i + "° " + "ciudad favorita: ");
            ciudadesFavoritas.add("#" + i + " - " + input.nextLine());
        }
        input.close();
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
