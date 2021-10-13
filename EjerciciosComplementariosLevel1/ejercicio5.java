//5.  Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class ejercicio5 {    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("ingrese dos numero enteros para hacer una multiplicacion: \nIngrese el 1° número: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el 2° número: ");
        int num2 = input.nextInt();
        input.close();
        int resultado = 0;
        for(int i = num1; i>0; i--){
            resultado += num2;
        }
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }
}
