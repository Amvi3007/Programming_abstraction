public class second_smallest {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 5, 2, 8};
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int min2 = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min2>arr[i] && arr[i]>min){
                min2 = arr[i];
            }
        }
        System.out.println(min2);
    }
}
