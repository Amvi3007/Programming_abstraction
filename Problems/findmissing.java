public class findmissing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};
        int n = arr.length;
        for(int i =0;i<n;i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]>0){
                arr[index] = -arr[index];
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
    }
}
