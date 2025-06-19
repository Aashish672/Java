package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Tree implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		return -a.compareTo(b);
	}
}
public class TreeSetExample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TreeSet<Integer> set=new TreeSet<>();
//		set.add(1);
//		set.add(1);
//		set.add(3);
//		set.add(4);
//		set.add(2);
//		set.add(1);
//		System.out.println(set);
//	}
	
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(new Tree());
		set.add(5);
		set.add(2);
		set.add(8);
		set.add(1);
		
		System.out.println(set);
	}

}
