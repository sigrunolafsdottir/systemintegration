package KlassDemo2;


public class StudentDemo {
    
    public static void main (String[] args){
        
        Student s = new Student ("Sanna", "Systemintegration");
        System.out.println(s.getName());
        
        Person p = new Student ("Pelle", "Systemintegration");  //hur kan detta funka?
        System.out.println(p.getName());
        
        //Student x = new Person ("Xavier", "Systemintegration");  //varför funkar inte detta?
        

    }

}
