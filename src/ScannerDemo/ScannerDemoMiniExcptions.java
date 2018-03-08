package ScannerDemo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerDemoMiniExcptions {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int i;
        try{
            i = sc.nextInt();
        }
        catch (InputMismatchException e){
            //System.out.println("Fel typ på indata");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Okänt fel inträffade");
        }
    }
}


