// 7 - Se dispone de una lista de Empleados, de cada empleado se conoce:
// Nombre y Apellido
// DNI
// horasTrabajadas
// valorPorHora
// Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
package EjerciciosComplementariosLevel2;
import java.util.HashMap;
import java.util.HashSet;
// import java.util.Iterator;
import java.util.Map;

public class ejercicio6 {    
        public static void main (String[] args){            
            empleado Trabajador1 = new empleado("Andres Rodriguez", "33042179", 8, 200);
            empleado Trabajador2 = new empleado("Cristian Romero", "32040091", 8, 300);                        
            empleado Trabajador3 = new empleado("Robertito Ortigoza", "31568976", 9, 300);    
            empleado Trabajador4 = new empleado("Noelia Espinosa", "30930290", 9, 500);    
            empleado Trabajador5 = new empleado("Rogelio Gomez", "10930290", 9, 500);    
            
            HashSet<empleado> trabajadorHashSet = new HashSet<>();
            
            trabajadorHashSet.add(Trabajador1);
            trabajadorHashSet.add(Trabajador2);
            trabajadorHashSet.add(Trabajador3);            
            trabajadorHashSet.add(Trabajador4);            
            trabajadorHashSet.add(Trabajador5);            
            
            Map<String, Integer> map = new HashMap<String, Integer>();
            for(empleado empl : trabajadorHashSet){
                map.put(empl.dni, empl.sueldo_mes());
            }
            // esto sería igual a 
            // map.put(Trabajador1.dni, Trabajador1.sueldo_mes());
                      
            System.out.println("\nLa lista de empleados fueron guardados en el siguiente map: ");
            
            int contador= 1;
            // usando foreach para itear el map
            for(Map.Entry<String, Integer> objeto : map.entrySet()){
                System.out.println(String.format("%d: Clave dni: %s -> Valor sueldo mes: %d", contador, objeto.getKey(), objeto.getValue()));
                contador+=1;
            }
            // usando Iterator para iterar el map
            // Iterator<String> it = map.keySet().iterator();
            // while(it.hasNext()){
            //     String key = it.next();
            //     System.out.println(String.format("%d: Clave dni: %s -> Valor sueldo mes: %d", contador, key, map.get(key)));
            //     contador+=1;
            // }            
    }
}
class empleado {
    String NombreApellido;
    String dni;
    int horasTrabajadas;
    int valorPorHora;    
    public empleado(String NombreApellido, String dni, int horasTrabajadas, int valorPorHora){
        this.NombreApellido = NombreApellido;
        this.dni = dni;   
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    public int sueldo_mes(){
        int sueldoMes = (this.horasTrabajadas * this.valorPorHora)*30;
        return sueldoMes;
    }
}


