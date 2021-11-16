package EjerciciosComplementariosLevel3;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("\"Homero", "Simpson\"", LocalDate.now().minusYears(30)),
            new Alumno("\"Andres", "Rodriguez\"", LocalDate.of(1987, 5, 22)),
            new Alumno("\"Ana", "Gomez\"", LocalDate.of(1985, 8, 11)),
            new Alumno("\"Roberto", "Baez\"", LocalDate.of(1985, 8, 11)),
            new Alumno("\"Mirtha", "Legrand\"", LocalDate.of(1900, 1, 11))      
        );        
        Map<Object, Object> listaAlumnos = alumnos.stream().collect(Collectors.toMap(a -> a.getDatos(), p-> p.getEdad()));
        System.out.println(listaAlumnos);
    }    
}
class Alumno{
    String nombre, apellido;
    LocalDate nacimiento;              
    Alumno(String nom, String ape, LocalDate nac){
    nombre = nom;
    apellido = ape;
    nacimiento = nac;              
    }
    public String getDatos(){return nombre + " " + apellido;}
    public int getEdad(){
        Period diferenciaFechas = Period.between(nacimiento, LocalDate.now());
        int años = Math.abs(diferenciaFechas.getYears());
        return años;        
    }
}

