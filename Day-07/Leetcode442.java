import java.util.*;

public class Leetcode442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] > 0){
                nums[idx] = - nums[idx];
            }else{
                list.add(Math.abs(nums[i]));
            }
        }

        return list;
    }

    public static void main(String[] args){
        Leetcode442 obj = new Leetcode442();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(obj.findDuplicates(nums));
    }
}
