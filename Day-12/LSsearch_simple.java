public class LSsearch_simple{
    public static int search(int[] arr , int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {5,2,9,6,4,8};
        int k = 6;
        System.out.println(search(arr,k));
    }

}