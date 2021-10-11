//5 -  Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
      List<Integer> horas_trabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
      List<Integer> ganancia_por_hora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

      List<Integer> total_por_dia = new ArrayList<>();
      
    //   System.out.println(ganancia_por_hora.get(0));
    //   System.out.println(horas_trabajadas.get(0) * ganancia_por_hora.get(0));

      int total_por_semana = 0;
      for(int i = 0; i<5; i++){
        //   total_por_semana = (horas_trabajadas.get(i) * ganancia_por_hora.get(i));
          total_por_dia.add(i, (horas_trabajadas.get(i) * ganancia_por_hora.get(i)));

        //   System.out.println(i);
        //   System.out.println(ganancia_por_hora.get(i));
        //   System.out.println(horas_trabajadas.get(i));
        //   System.out.println(total_por_dia.get(i));

          total_por_semana += total_por_dia.get(i);
          

      }

      
    //   Iterator<Integer> Iterar_total_por_semana_trabajado = total_por_dia.iterator();
    //   while(Iterar_total_por_semana_trabajado.hasNext()){
    //     Integer total_por_semana_trabajado= Iterar_total_por_semana_trabajado.next();
    //     System.out.print(total_por_semana_trabajado);
    //     }
        
        System.out.println(total_por_dia);
        
        System.out.println("Total final:  $" + total_por_semana);
    
    }
    
}
