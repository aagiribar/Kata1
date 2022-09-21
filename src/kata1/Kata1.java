package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2001, Month.DECEMBER, 9);
        Person persona = new Person("Pepe", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }
    
}
