
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        System.out.println(sequence(s));
    }

    static String sequence(String s){
        if(s.length()==0){
            return "String not found";
        }else if(s.length()>8){
            return "String length exceeds";
        }
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        int num=1;
        for(int i=0;i<s.length();i++){
            stack.push(num++);
            if(s.charAt(i)=='I'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        stack.push(num);
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
