package mystringbuffer;

import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Constructor 1
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        //Constructor 2
        StringBuffer sb2=new StringBuffer("Aashish Kumar Singh");

        //Constructor 3
        StringBuffer sb3=new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("Data Science and Machine Learning");
        sb.append("is nice");

        //sb.insert(2,"or");

        sb.replace(1,5,"DY");
        sb.delete(0,1);

        //sb.reverse();
        String str=sb.toString();
        System.out.println("StringBuffer: "+str);

        int n=20;
        String name = generateRandomString(n);
        System.out.println("Random String: "+name);

        //remove whitespaces

        String sentence = "Hi h   hjh  hjkso  siowi     w ";
        System.out.println(sentence.replaceAll("\\s+", " "));

        //split
        String arr="Kunal,Apoorv,Rahul,Snehal";
        String[] names=arr.split(",");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df=new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }   
    public static String generateRandomString(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
