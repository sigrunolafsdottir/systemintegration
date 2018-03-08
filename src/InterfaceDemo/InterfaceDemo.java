package InterfaceDemo;

public class InterfaceDemo {
    
    public static void main (String[] args){
        
        Student s = new Student ("Sanna", "Systemintegration");
        System.out.println(s.getName()+" "+s.getFavouriteDrink());
        
        PartyAnimal m = new Student ("Mimmi", "Systemintegration");
        System.out.println(m.getFavouriteDrink());
        
        //Varför funkar inte detta?
        //System.out.println(m.getName());
        

    }

}
