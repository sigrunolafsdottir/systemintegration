package KlassDemo1;


public class PersonDemo {
    
    public static void main (String[] args){
        
        String test = new String("test1");
        String test2 = "test2";
        
        Person p = new Person ("Sigrun", 5);
        System.out.println(p.getName());
        
        //p.setName("Bertil");
        p.name = "Hej";
        System.out.println(p.getName());
    }

}
