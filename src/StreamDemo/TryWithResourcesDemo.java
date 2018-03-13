package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class TryWithResourcesDemo {
    
    public static void main(String[] args){
        String tempLine;
       // try (BufferedReader bufIn = new BufferedReader(new FileReader ("src\\StreamDemo\\Luka.txt"));){
        try (FileReader f = new FileReader ("src\\StreamDemo\\Luka.txt");){
            while((tempLine = String.valueOf(f.read())).equals("-1") ){
                System.out.println(tempLine);
            }
        }
        catch (Exception e){
            System.out.println("File could not be found");
        }
    }


}
