import java.util.ArrayList;

public class removedupl {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,6,5,4};
        ArrayList<Integer> array = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            boolean duplicated = false;
            for(int j = 0;j<i;j++){
                if(arr[i] == arr[j]){
                    duplicated = true;
                }
            }
            if(!duplicated){
                array.add(arr[i]);
            }
        }
        System.out.println(array);
    }
}
