public class find_leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int min = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>min){
                System.out.println(arr[i]);
                min = arr[i];
            }
        }
    }
}
