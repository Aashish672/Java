public class Continous {
    public static int longestContinuousSubstring(String s) {
        int length=s.length();
        int ans=1,count=1;
        for(int i=1;i<length;i++){
            int a=s.charAt(i-1);
            int b=s.charAt(i);
            if(b-a==1){
                count++;
            }else{
                ans=Math.max(ans,count);
                count=1;
                }
            }
        ans=Math.max(ans,count);
        return ans;
        }
    
    public static void main(String[] args){
        String s="abcde";
        System.out.println(longestContinuousSubstring(s));
    }
}
