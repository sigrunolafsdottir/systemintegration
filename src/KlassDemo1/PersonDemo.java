package KlassDemo1;


public class PersonDemo {
    
    public static void main (String[] args){
        
        Person p = new Person ("Sigrun");
        System.out.println(p.getName());
        
        p.setName("Bertil");
        System.out.println(p.getName());
    }

}
