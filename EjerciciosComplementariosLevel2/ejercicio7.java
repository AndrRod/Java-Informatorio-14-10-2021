// 7.  Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
// Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
// Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.List;
public class ejercicio7{ 
    public static void main(String[] args) {
        
        ArrayString2argumentos(1, 8);
    }
    public static void ArrayString2argumentos(Integer num1, Integer num2){
       
        List<String> resultado = new ArrayList<String>();
        
        for(int i = (num1-1); i< num2; i ++){
            if(i == num1 || i == (num2-1)){
                resultado.add(String.valueOf(i));                
            }
            else if(i%3 == 0 && i%2==0){
                resultado.add("FizzBuzz");   
            }
            else if(i%2 == 0){
                resultado.add("Fizz");
                
            }
            else if(i%3 == 0){
                resultado.add("Buzz");   
            }
            else{
                resultado.add(String.valueOf(i));
            }
        }
        for(int i =num1; i<num2; i++){
            System.out.println(resultado.get(i));
        }
    }
}