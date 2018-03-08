package StaticDemo;


public class StaticDemo {
    
    public void doPrint(){
        System.out.println("Hej");
    }
    
    public static void main(String[] args){
        //System.out.println("Hej");
        StaticDemo std = new StaticDemo();
        std.doPrint();
    }

}
