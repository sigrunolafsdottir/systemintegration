package KlassDemo1;

public class Person {
    
    private String name;
    
    Person (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
}
