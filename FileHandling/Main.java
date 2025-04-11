package FileHandling;

import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //create
        try{
            File fo=new File("FileHandling\\new-file.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //write in the file
        try{
            FileWriter fw = new FileWriter("FileHandling\\new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
          }

          // reading from a file
    try (BufferedReader br = new BufferedReader(new FileReader("FileHandling\\new-file.txt"))) {
        while (br.ready()) {
          System.out.println(br.readLine());
        }
      } catch (IOException e) {
          System.out.println(e.getMessage());      
      }
  
      // create
      try {
        File fo = new File("FileHandling\\random.txt");
        fo.createNewFile();
        if(fo.delete()) {
          System.out.println(fo.getName());
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
  
    }
}
