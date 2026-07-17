import java.util.*;

public class Leetcode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i=0;i<candies.length;i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            candies[i] = candies[i]+ extraCandies;
            if(candies[i] >=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
    return list;
    }

    public static void main(String[] args){
        Leetcode1431 obj = new Leetcode1431();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(obj.kidsWithCandies(candies,extraCandies));
    }
}
