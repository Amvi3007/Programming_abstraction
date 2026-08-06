import java.util.*;

public class Leetcode75 {
    public static void pivotIndex(int[] nums , int low, int high){
        if(low>=high){
            return;
        }
        int pivotIndex = partition(nums,low,high);
        pivotIndex(nums,low,pivotIndex-1);
        pivotIndex(nums,pivotIndex+1,high);
    }

    public static int partition(int[] nums , int low,int high){
        int pivot = nums[high];
        int i = low - 1;
        for(int j = low ; j<high ; j++){
            if(pivot > nums[j]){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[high];
        nums[high] = nums[i+1];
        nums[i+1] = temp;

        return i+1;
    }

    public static void sortColors(int[] nums) {
        pivotIndex(nums,0,nums.length-1);
    }

    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
