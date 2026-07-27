public class Kth_Smallest_ele {
    public static int kth_Smal_el(int[] arr,int k){
        int n = arr.length;
        for(int i= 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min  = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr[k-1];
    }

    public static void main(String[] args){
        int[] arr = {1,4,3,9,7,6,2,11};
        System.out.println(kth_Smal_el(arr,3));
    }
}
