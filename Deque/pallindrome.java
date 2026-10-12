package Programming_abstraction.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class pallindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder sb = new StringBuilder();
        Deque dq = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            dq.addFirst(s.charAt(i));
        }

        while(!dq.isEmpty()){
            sb.append(dq.removeFirst());
        }

        String s2 = new String(sb);
        if(s.equals(s2)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}
