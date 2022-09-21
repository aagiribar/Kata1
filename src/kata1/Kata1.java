package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person persona = new Person("Pepe", new Date(101, 11, 9));
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }
    
}
