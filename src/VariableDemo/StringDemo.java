package VariableDemo;

public class StringDemo {
    
    public static void Adder(String s){
        s = s + " Då";
        System.out.println("s inside Adder: "+s);
    }
    
    public static void main (String[] args){
        String s = "Hej";
        System.out.println("s before passing: "+ s);
        Adder(s);
        System.out.println("s after passing: "+s);
    }

}
