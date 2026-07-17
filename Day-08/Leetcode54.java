import java.util.*;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;int right = m-1;
        int top = 0;int bottom = n-1;
        while(left<=right && top<= bottom){
            for(int i=left;i<=right ; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom ;i++){
                list.add(matrix[i][right]);
            }
            right--;


            if(top<=bottom){
                for(int i = right ; i>=left ;i--){
                    list.add(matrix[bottom][i]);
                }

                bottom--;
            }

            if(left<=right){
                for(int i = bottom;i>=top ;i--){
                    list.add(matrix[i][left]);
                }

                left++;
            }

        }

        return list;
    }

    public static void main(String[] args){
        Leetcode54 obj = new Leetcode54();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(obj.spiralOrder(matrix));
    }
}
