public class Prime {
    public static boolean check(int n){
        if(n == 1){
            return false;
        }
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 25;
        for(int i =1;i<25;i++){
            if(check(i)){
                System.out.println(i);
            }
        }
    }
}
