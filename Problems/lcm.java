public class lcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int lcm = 1;
        for(int i =1;;i++){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
