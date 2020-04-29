package VariableDemo;

public class IntDemo {
    
    public static void Adder(int i){
        i = i+1;
        System.out.println("i inside Adder: "+i);
    }
    
    public static void AdderInteger(Integer i){
        i = i+1;
        System.out.println("i inside AdderInteger: "+i);
    }
    
    public static void main (String[] args){
        //int i = 1;
        Integer i = 1;
        System.out.println("i before adding: "+ i);
        AdderInteger(i);
        System.out.println("i after addingInteger: "+i);
      //  Adder(i);
      //  System.out.println("i after adding: "+i);
    }

}
