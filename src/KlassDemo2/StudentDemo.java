package KlassDemo2;

import java.util.ArrayList;
import java.util.List;


public class StudentDemo {
    
    public static void main (String[] args){
        
        Student s = new Student ("Sanna", "Systemintegration");
        //System.out.println(s.getName());
        
        Person p = new Student ("Pelle", "fdsfs");  //hur kan detta funka?
        //System.out.println(p.getName());
        
        //Student x = new Person ("Xavier", "Systemintegration");  //varför funkar inte detta?
        
        s.printMe();
        p.printMe();
        
        List<Person> lista = new ArrayList<>();
        lista.add(s);
        lista.add(p);
        
        for ( Person person : lista){
            person.printMe();
        }
    }

}
