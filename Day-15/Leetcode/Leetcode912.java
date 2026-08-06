import java.util.Arrays;

public class Leetcode912 {
    public static void mergeSort(int[] nums,int low , int high){
        if(low>=high){
            return;
        }
        int mid = low + (high - low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    public static void merge(int[] nums,int low , int mid , int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while(left<= mid && right <=high){
            if(nums[left]<=nums[right]){
                temp[k++] = nums[left++];
            }else{
                temp[k++] = nums[right++];
            }
        }

        while(left<=mid){
            temp[k++] = nums[left++];
        }

        while(right<=high){
            temp[k++] = nums[right++];
        }

        for(int i = low;i<=high;i++){
            nums[i] = temp[i - low];
        }
    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
