package Collection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(1);
		set.add(null);
		set.add(3);
		set.add(2);
		System.out.println(set);
	}

}
