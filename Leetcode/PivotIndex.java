//https://leetcode.com/problems/find-pivot-index/description/?envType=problem-list-v2&envId=array


package Leetcode;
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int[] sumLeft=new int[nums.length];
        sumLeft[0]=0;
        int[] sumRight=new int[nums.length];
        sumRight[nums.length-1]=0;

        for(int i=1;i<nums.length;i++){
            sumLeft[i]=nums[i-1]+sumLeft[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            sumRight[i]=sumRight[i+1]+nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            if(sumLeft[i]==sumRight[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(pivotIndex(arr));
    }
}
