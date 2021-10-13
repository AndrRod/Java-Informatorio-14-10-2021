// 2 . Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Por favor ingrese dos número enteros, para imprimir en consola el resultado de distintas operaciones. \nIngrese el primer numero: ");
        int numero1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = input.nextInt();
        input.close();
        System.out.println( numero1 + " + " + numero2 + " = " + (numero1+numero2));        
        System.out.println( numero1 + " - " + numero2 + " = " + (numero1-numero2));        
        System.out.println( numero1 + " * " + numero2 + " = " + (numero1*numero2));        
        System.out.println( numero1 + " / " + numero2 + " = " + (numero1/numero2));        
        System.out.println( numero1 + " % " + numero2 + " = " + (numero1%numero2));        
        
    }
}
