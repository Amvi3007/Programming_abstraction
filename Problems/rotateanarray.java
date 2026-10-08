

public class rotateanarray {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,8,4,2,4};
        int k = 3;
        int[] temp = new int[k];
        for(int i =0;i<k;i++){
            temp[i] = arr[arr.length-k+i];
        }

        for(int i =arr.length-1;i>=k;i--){
            arr[i] = arr[i-k];
        }

        for(int i =0;i<k;i++){
            arr[i] = temp[i];
        }

        for(int x:arr){
            System.out.println(x);
        }
    }
}
