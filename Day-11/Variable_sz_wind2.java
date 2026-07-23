public class Variable_sz_wind2 {
    public static int Subarray(int[] arr, int k)
    {
        int left = 0;
        int sum = 0;
        int count = 0;
        for(int right = 0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            count += (right - left) + 1;
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 3;
        System.out.println(Subarray(arr,k));
        
    }
}
