// 1768
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word="";
        for(int i=0;i<word1.length();i++){
            word=word+word1.charAt(i)+word2.charAt(i);
        }

    }
}
