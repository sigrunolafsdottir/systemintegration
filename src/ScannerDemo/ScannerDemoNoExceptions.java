package ScannerDemo;

import java.util.Scanner;


public class ScannerDemoNoExceptions {
    
    ScannerDemoNoExceptions(){
        Scanner sc = new Scanner(System.in);
        int kostnad = 0;
        
        System.out.println("Skriv din kostnad: ");
        
        boolean gettingKostnad = false;
        while (!gettingKostnad){
                if (sc.hasNextInt()){
                    kostnad = sc.nextInt();
                    gettingKostnad = true;
                }
                else if (sc.hasNext()){
                    System.out.println("Felaktig kostnad, försök igen ");
                    //vi måste äta upp vårt token för att inte fastna i oändlig loop
                    sc.next();  
                }
        }
        
        System.out.println("Kostnad "+ kostnad);
        
    }
    
    public static void main(String[] args){
        ScannerDemoNoExceptions sc = new ScannerDemoNoExceptions();
    }

}
