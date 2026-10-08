public class pairwithSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;
        for(int i =0;i<arr.length;i++){
            int x = arr[i];
            for(int j =i+1;j<arr.length;j++){
                if( (x+arr[j]) == target ){
                    System.out.println(x + " "+arr[j]);
                }
            } 
        }
    }
}
