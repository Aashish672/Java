package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aashish");
        names.add("Aakash");
        names.add("Brijesh");
        names.add(null);
        names.add("Aashish");
        System.out.println(names.get(1)); 
        //names.set(1, "Abhishek");
        System.out.println(names); 

//        for (String name : names) {
//            System.out.println(name);
//        }
    	
    	ArrayList list=new ArrayList();
    	list.add("Aashish");
    	list.add(123);
    	System.out.println(list);
    }
}