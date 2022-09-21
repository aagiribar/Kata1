package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2022, 12, 9);
        Person persona = new Person("Pepe", date);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años");
    }
    
}
