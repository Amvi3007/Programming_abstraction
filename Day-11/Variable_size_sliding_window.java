import java.util.*;

public class Variable_size_sliding_window {
    public static int SmallestSubarray(int[] arr, int k)
    {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int right = 0; right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                minLength = Math.min(minLength,right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(SmallestSubarray(arr,7));
    }
}
