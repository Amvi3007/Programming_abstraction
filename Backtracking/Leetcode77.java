// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Leetcode77 {
    static List<List<Integer>> answer = new ArrayList<>();
    public static void backtrack(int start,int n,int k,List<Integer> list){
        if(list.size() == k){
            answer.add(new ArrayList<>(list));
            return;
        }
        for(int i = start;i<=n;i++){
            list.add(i);
            backtrack(i+1,n,k,list);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args){
        int n = 4;
        int k = 2;
        List<Integer> list = new ArrayList<>();
        backtrack(1,n,k,list);
        System.out.println(answer);
    }
    

}