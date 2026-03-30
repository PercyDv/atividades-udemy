package src.folderApplication;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a folder path");
        String strPath = kb.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        for(File folder : folders) {
            System.out.println(folder);
        }

        File[] file = path.listFiles(File::isFile);

        System.out.println("FILES: ");
        for (File files : file) {
            System.out.println(files);
        }

        boolean success = new File(strPath+"\\aba").mkdir();
        System.out.println("Diretory created successfully: "+success);

        kb.close();
    }
}
