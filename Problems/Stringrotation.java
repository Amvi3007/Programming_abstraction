public class Stringrotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cbad";
        if(s1.length()!=s2.length()){
            System.out.println("not rotation");
        }
        else if((s1+s1).contains(s2)){
            System.out.println("rotation");
        }else{
            System.out.println("no rotation");
        }
    }
}
