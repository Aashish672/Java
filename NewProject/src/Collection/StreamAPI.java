package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
		List<Integer> even=arr.stream().filter(n->n%2==0).collect(Collectors.toList());
		arr.stream().filter(n->n%2==1).forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println(even);
		
	}

}
