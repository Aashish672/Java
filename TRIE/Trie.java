package TRIE;

//import java.util.*;
public class Trie {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
        int idx = word.charAt(i) - 'a';

        if (curr.children[idx] == null) {
            curr.children[idx] = new Node();
        }

        curr = curr.children[idx];  // only move to the next node, don't reassign

        if (i == word.length() - 1) {
            curr.eow = true;  // mark the end of word
        }
    }
}


    public static boolean search(String key){
        // int level=0;
        // int len=key.length();

        // int idx=0;

        // Node curr=root;
        // for(;level<len;level++){
        //     idx=key.charAt(level)-'a';
        //     if(curr.children[idx]==null){
        //         return false;
        //     }
        //     curr=curr.children[idx];
        // }
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            Node node=curr.children[idx];

            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        //return curr.eow==true;
        return true;
    }

public static boolean wordBreak(String key){
    if(key.length()==0){
        return true;
    }
    for(int i=1;i<=key.length();i++){
        String firstPart=key.substring(0,i);
        String secondPart=key.substring(i);
        if(search(firstPart) && wordBreak(secondPart)){
            return true;
        }
    }
    return false;
}

public static boolean startsWith(String prefix){
    Node curr=root;
    for(int i=0;i<prefix.length();i++){
        int idx=prefix.charAt(i)-'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr=curr.children[idx];
    }
    return true;
}

public static int countNode(Node root){
    if(root==null){
        return 0;
    }
    int count=0;
    for(int i=0;i<26;i++){
        if(root.children[i]!=null){
            count+=countNode(root.children[i]);
        }
    }
    return 1+count;
}


 static void longestWord(Node root,StringBuilder curr){
    for(int i=0;i<26;i++){
        if(root.children[i]!=null && root.children[i].eow==true){
            curr.append((char)(i+'a'));
            if(curr.length()>ans.length()){
                ans=curr.toString();
            }
            longestWord(root.children[i], curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
public static String ans="";
    public static void main(String[] args) {

        //Insert function
        // String words[] = { "the", "a", "there", "their", "any" };

        // for (String word : words) {
        //     insert(word);
        // }
        // System.out.println(search("there"));
        // System.out.println(search("thor"));


        //WordBreak
        // String words[]={"i","like","sam","samsung","mobile"};
        // String key="ilikesam";
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(wordBreak(key));


        //startsWith
        // String words[]={"apple","app","mango","man","woman"};
        // String prefix="app";
        // for(String word:words){
        //     insert(word);
        // }
        // System.out.println(startsWith(prefix));

        //Substrings(countNode)
        // String str="ababa";

        // for(int i=0;i<str.length();i++){
        //     String suffix=str.substring(i);
        //     insert(suffix);;
        // }
        // System.out.println(countNode(root));

        //Longest Word with all Prefixes
        String[] words={"a","banana","app","appl","ap","apply","apple"};
        for(String word:words){
            insert(word);
        }
        StringBuilder sb=new StringBuilder();
        longestWord(root, sb);
        System.out.println(ans);
    }
}
