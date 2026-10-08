public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,3,2};
        int k = 3;
        int temp[] = new int[k];
        for(int i =0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i = 0;i<arr.length-k;i++){
            arr[i] = arr[i+k];
        }
        
        for(int i = arr.length-k;i<arr.length;i++){
            arr[i] = temp[i-k];
        }

        for(int x : arr){
            System.out.println(x);
        }

        
    }
}
