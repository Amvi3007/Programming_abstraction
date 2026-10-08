public class moveneg {
    public static void main(String[] args) {
        int[] arr = {2, -4, 5, -1, 3, -6, 8};
        int j = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for(int x : arr){
            System.out.println(x);
        }
    }
}
