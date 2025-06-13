package Recursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(combination("", "12"));
    }

    static void numbers(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';// this will convert "2" into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            numbers(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> combination(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combination(p + ch, up.substring(1)));
        }
        return list;
    }

    static int count(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digits = up.charAt(0) - '0';
        for (int i = (digits - 1) * 3; i < digits * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + count(p + ch, up.substring(1));
        }
        return count;
    }
}
