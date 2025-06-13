package Training;

import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(count(a));
		bubble_sort(a);
		sc.close();
	}
	static int count(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	static void bubble_sort(int[] arr) {
        //boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            //swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    //swapped = true;
                }
            }
            /**if (!swapped) {
                break;
            }**/
        }
        System.out.println(arr[arr.length-2]);
    }
}
