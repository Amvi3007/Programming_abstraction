import java.util.*;

public class Leetcode1456 {
    public static boolean check(char ch){
        return ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            if(check(s.charAt(i))){
                count++;
            }
        }

        int ans = count;
        for(int i=k;i<s.length();i++){
            if(check(s.charAt(i))){
                count++;
            }
            if(check(s.charAt(i-k))){
                count -- ;
            }

            ans = Math.max(ans,count);
        }


        return ans;
    }

    public static void main(String[] args){
        Leetcode1456 obj = new Leetcode1456();
        String s = "abciiidef";
        int k = 3;
        System.out.println(obj.maxVowels(s,k));
    }
}
