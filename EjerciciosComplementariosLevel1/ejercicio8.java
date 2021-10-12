// 8. Crear una aplicación que solicite de entrada los datos de una persona en este orden: Nombre y Apellido, Edad, Dirección, Ciudad
// Luego imprimirá el siguiente mensaje: {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ingrese su nombre y apellido: ");
        String nombre_apellido = input.nextLine();
        System.out.print("ingrese su edad: ");
        String edad = input.nextLine();
        System.out.print("ingrese su direccion: ");
        String direccion = input.nextLine();
        System.out.print("ingrese su ciudad: ");
        String ciudad = input.nextLine();

        System.out.println();
        System.out.println("Ciudad: "+ ciudad + " - " + "Dirección: " + direccion + " - " + "Edad: "+ edad + " - " + "Nombre y Apellido: " + nombre_apellido);
    }
}
