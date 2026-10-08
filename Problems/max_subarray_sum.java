public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0;
        int max = 0;
        for(int i =0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum = 0;
            }
            if(currentSum>max){
                max = currentSum;
            }
        }
        System.out.println(max);
    }
}
