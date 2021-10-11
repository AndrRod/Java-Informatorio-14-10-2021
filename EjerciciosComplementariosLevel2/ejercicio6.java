// 7 - Se dispone de una lista de Empleados, de cada empleado se conoce:
// Nombre y Apellido
// DNI
// horasTrabajadas
// valorPorHora
// Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

package EjerciciosComplementariosLevel2;


// import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
// import java.util.Scanner;
// import java.util.Set;

public class ejercicio6 {
    
    String NombreApellido;
    String dni;
    int horasTrabajadas;
    int valorPorHora;
    
    ejercicio6(String NombreApellido, String dni, int horasTrabajadas, int valorPorHora){
        this.NombreApellido = NombreApellido;
        this.dni = dni;   
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }

    
    public static void main (String[] args){
        
            

            ejercicio6 Trabajador1 = new ejercicio6("Andres Rodriguez", "3304279", 8, 200);
            ejercicio6 Trabajador2 = new ejercicio6("Cristian Romero", "3204209", 8, 300);
            
            HashSet<ejercicio6> trabajadorHashSet = new HashSet<>();
            
            trabajadorHashSet.add(Trabajador1);
            trabajadorHashSet.add(Trabajador2);
            
            System.out.println(Trabajador1.NombreApellido);


            
            Map<String, Integer> map = new HashMap<String, Integer>();  
            
            map.put(Trabajador1.dni, ((Trabajador1.horasTrabajadas*Trabajador1.valorPorHora)*30));
            map.put(Trabajador2.dni, ((Trabajador2.horasTrabajadas*Trabajador2.valorPorHora)*30));
            
            
            Iterator<String> it = map.keySet().iterator();

            while(it.hasNext()){
                String key = it.next();
                System.out.println("Clave dni: " + key + " -> Valor sueldo mes: " + map.get(key));
              }


            
    }

}
        

