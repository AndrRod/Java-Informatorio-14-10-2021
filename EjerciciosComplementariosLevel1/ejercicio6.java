// 6 - Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros para calcular la potencia: ");
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int potencia = num1;
        for(int i = num2; i>1; i--){
            potencia *= num1;
            
        }
        System.out.println(num1 + " elevado a " + num2 + " = " + potencia);

    }
}