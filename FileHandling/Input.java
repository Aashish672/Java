package FileHandling;

import java.io.*;
public class Input {
     static void input(){
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Enter some letters:");
            int letters=isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        try(FileReader fr=new FileReader("FileHandling\\n" + //
                        "ote.txt")){
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //byte to char stream and then reading char stream

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed:"+br.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br=new BufferedReader(new FileReader("FileHandling\\n" + //
                        "ote.txt"))){
            while(br.ready()){
            System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
