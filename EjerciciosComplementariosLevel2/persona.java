package EjerciciosComplementariosLevel2;

import java.util.HashSet;

public class persona {
    int age;
    String name;

    persona(String name, int age){
    	this.name = name;
    	this.age = age;   
    }
      // public static void main(String[] args) {
    
    public static void main(String[] args) {
            
        persona person1 = new persona("Juan",18);
        persona person2 = new persona("Miguel",25);
        persona person3 = new persona("Luis",18);
        persona person4 = new persona("Luis",18);
        
        // System.out.println(person1.age);
        HashSet<persona> personas = new HashSet<>();
        personas.add(person1);
        personas.add(person2);
        personas.add(person3);
        personas.add(person4);

    // }
    
    
    }
}
        
    
            
    


