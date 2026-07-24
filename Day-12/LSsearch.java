

public class LSsearch {
    public static int search(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int[] arr = {5,2,9,6,4,8};
        System.out.println(search(arr));
    }
}
