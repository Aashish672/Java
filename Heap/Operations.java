import java.util.*;
public class Operations {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            //add at last index
            arr.add(data);

            int x=arr.size()-1; // x is child index
            int par=(x-1)/2;    // parent index

            while(arr.get(x)<arr.get(par)){  //O(log n)

                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int min=i;

            if(left<arr.size() && arr.get(min)>arr.get(left)){
                min=left;
            }
            if(right<arr.size() && arr.get(min)>arr.get(right)){
                min=right;
            }

            if(min!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
        }
        public int remove(){
            int data=arr.get(0);

            //step 1= swap first & last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
        public void heapSort(int arr[]){
            int n=arr.length;
            //Step 1: Build MaxHeap
            for(int i=n/2;i>=0;i--){
                heapify(arr,i,n);
            }

            //Step 2: Push largest ate end
            for(int i=n-1;i>0;i--){
                //swap (largest-first with last)
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;

                heapify(arr,0,i);
            }
        }

        public static void heapify(int arr[],int i,int size){
            int left=2*i+1;
            int right=2*i+2;
            int maxIdx=i;

            if(left<size && arr[left]>arr[maxIdx]){
                maxIdx=left;
            }
            if(right<size && arr[right]>arr[maxIdx]){
                maxIdx=right;
            }

            if(maxIdx!=i){
                int temp=arr[i];
                arr[i]=arr[maxIdx];
                arr[maxIdx]=temp;

                heapify(arr,maxIdx,size);
            }
        }
    }

    public static void main(String[] args) {
        Heap h=new Heap();
        /**h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){ //heap sort-O(nlog nin)
            System.out.println(h.peek());
            h.remove();
        }**/

        int[] arr={1,2,4,5,3};
        h.heapSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
