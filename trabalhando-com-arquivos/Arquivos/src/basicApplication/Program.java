package src.basicApplication;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        File file = new File("C:\\git");
        java.util.Scanner kb = null;

        try {
            kb = new Scanner(file);
            while (kb.hasNextLine()){
                System.out.println(kb.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        } 
        finally {
            if(kb != null){
                kb.close();
            }   
        }
    }
}
