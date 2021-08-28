package CodeWithHarry;

import java.io.*;
import java.util.Scanner;

public class JavaFileHandling {
    public static void main(String[] args) {

        ////to create the file
        File file = new File("vik.txt");
        //file.delete();    //to delete the file
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Couldnt Create a File");
            e.printStackTrace();
        }

        ////to write the file
        try {
            FileWriter fileWriter = new FileWriter("vik.txt");
            fileWriter.write("This is the fileWriter");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //to read the file
        try {
            Scanner sc = new Scanner(file);
            /*while (sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }*/
            String s = sc.nextLine();
            System.out.println(s);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
