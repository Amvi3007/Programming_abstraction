class prefixSum {
    public static void main(String[] args){
        int[] arr = {2,5,3,8,1,6};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            int s = 2;
            int e = 5;
            prefix[i] = prefix[i-1] + arr[i];
            
            if(s==0){
                sum = prefix[e];
            }else{
                sum = prefix[e] - prefix[s-1];
            }
            
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(prefix[i] + " ");
        }

        System.out.println();

        System.out.println("Sum of elements from index " + 2 + " to " + 5 + " is: " + sum);

    }

}