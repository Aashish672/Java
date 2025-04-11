package FileHandling;

import java.io.*;
public class Output {
    static void output(){

        //output
        OutputStream os=System.out;

        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr="hello world".toCharArray();
            osw.write(arr);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fw=new FileWriter("FileHandling\\n" + //
                        "ote.txt",true)){
                            fw.write("This should be appended");
                        }catch(IOException e){
                            System.out.println(e.getMessage());
                        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("FileHandling\\n" + //
                        "ote.txt"))) {
            bw.write("Hare Krishna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
