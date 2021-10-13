package EjerciciosComplementariosLevel1;
import java.util.Scanner;
//1. Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

public class ejercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre para imprimir en consola un saludo con su nombre!!!");
        String nombre = input.nextLine();
        input.close();
        System.out.println("HOLA " + nombre.toUpperCase());
    }
}