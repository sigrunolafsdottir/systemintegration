package VariableDemo;

public class IntAssClassMemberDemo {
    
    public static void Adder(DemoIntClass classObject){
        classObject.i = classObject.i+1;
        System.out.println("i.i inside Adder: "+classObject.i);
    }
    
    public static void main (String[] args){
        DemoIntClass classObject =  new DemoIntClass();
        System.out.println("classObject.i before adding: "+ classObject.i);
        Adder(classObject);
        System.out.println("classObject.i after adding: "+classObject.i);
    }

}
