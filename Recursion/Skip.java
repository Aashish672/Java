package Recursion;

public class Skip {
    public static void main(String[] args) {
        System.out.println(skip_string("bacapplecdah"));
    }

    static void character(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            character(p, up.substring(1));
        } else {
            character(p + ch, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skip_string(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skip_string(up.substring(5));
        } else {
            return up.charAt(0) + skip_string(up.substring(1));
        }
    }
}
