package KlassDemo1;

public class Person {
    
    protected String name;
    protected Integer age;
    
    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
}
