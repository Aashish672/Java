import java.util.Stack;

class Repeating{
    static int repeating(String s){
    Stack<Character> result=new Stack<>();
    for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    result.push(ch);
    for(int j=i+1;j<s.length();j++){
    if(result.peek().equals(s.charAt(j))){
    result.pop();
    break;
    }
    }
    if(!result.isEmpty()){
    return i;
    }
    }
    return -1;
    }
    public static void main(String[] args)
    {
    String s="lovelycode";
    System.out.println(repeating(s));
    }
    }