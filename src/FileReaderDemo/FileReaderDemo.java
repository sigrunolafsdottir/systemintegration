package FileReaderDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class FileReaderDemo {

    public static void main(String[] args){
        String tempLine;
        try {
            BufferedReader bufIn = new BufferedReader(new FileReader ("src\\FileReaderDemo\\Luka.txt"));
            //med BufferedReader kan vi läsa en rad i taget
            while((tempLine = bufIn.readLine()) != null){
                System.out.println(tempLine);
            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }
    }
}

