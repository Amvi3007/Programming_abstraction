public class checkArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2};
        int[] arr2 = {2, 1, 2, 3};
        if(arr1.length!=arr2.length){
            System.out.println("Not equal");
        }else{
            boolean found = false;
            for(int i=0;i<arr1.length;i++){
                int count = 0;
                for(int j  =0;j<arr1.length;j++){
                    if(arr1[i] == arr1[j]){
                        count++;
                    }
                }
                int count2 = 0;
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i] == arr2[j]){
                        count2++;
                    }
                }
                if(count != count2){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Not equal");
            }
            else{
                System.out.println("Equal");
            }
        }
    }
}
