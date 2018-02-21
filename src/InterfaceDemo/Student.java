package InterfaceDemo;

public class Student extends Person implements PartyAnimal{
    
    private String kurs;
    
    public Student(String namn, String kurs){
        super(namn);
        this.kurs = kurs;
    }
    
    public String getFavoriteSnack() {
        return "Popcorn";
    }
    
}
