public class equilibrium_index {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        int right = 0;
        for(int i=0;i<arr.length;i++){

            
            int left = sum - arr[i] -right;

            if(left == right){
                System.out.println(i);
                break;
            }

            right+=arr[i];
            
        }
    }
}
