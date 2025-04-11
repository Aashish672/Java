package LinkedList;

import java.io.IOException;
import java.util.*;
import java.util.List;

public class Convert {
    public static void main(String args[]) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        int sum = 0, c = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum = sum + list.get(i) * (int) Math.pow(2, c);
            c++;
        }
        System.out.println(sum);
    }
}
