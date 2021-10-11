// 7 - Se dispone de una lista de Empleados, de cada empleado se conoce:
// Nombre y Apellido
// DNI
// horasTrabajadas
// valorPorHora
// Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
package EjerciciosComplementariosLevel2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ejercicio6 {    
        public static void main (String[] args){
          
            empleado Trabajador1 = new empleado("Andres Rodriguez", "3304279", 8, 200);
            empleado Trabajador2 = new empleado("Cristian Romero", "3204209", 8, 300);                        
            empleado Trabajador3 = new empleado("Robertito Ortigoza", "3104229", 9, 300);    

            HashSet<empleado> trabajadorHashSet = new HashSet<>();
            
            trabajadorHashSet.add(Trabajador1);
            trabajadorHashSet.add(Trabajador2);
            trabajadorHashSet.add(Trabajador3);            
            
            Map<String, Integer> map = new HashMap<String, Integer>();  
            
            map.put(Trabajador1.dni, ((Trabajador1.horasTrabajadas*Trabajador1.valorPorHora)*30));
            map.put(Trabajador2.dni, ((Trabajador2.horasTrabajadas*Trabajador2.valorPorHora)*30));
            map.put(Trabajador3.dni, ((Trabajador2.horasTrabajadas*Trabajador2.valorPorHora)*30));
            
            // la iteracion del map funciona tambien de la siguiente manera:
            // for(int i = 0; i< map.keySet().size() ; i++){
            //     System.out.print((map.keySet().iterator()).next() + " ");
            //     System.out.println(map.get((map.keySet().iterator()).next()));
            // }
            
            System.out.println("\nLa lista de trabajadores fueron guardados en el siguiente map: ");
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()){
                String key = it.next();
                System.out.println("Clave dni: " + key + " -> Valor sueldo mes: " + map.get(key));
              }
            
    }

}
        

