package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(2, 2));
        System.out.println(pathRetDiagonal("", 2, 2));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }
}
