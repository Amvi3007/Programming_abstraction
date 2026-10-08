public class perfectno {
    public static void main(String[] args) {
        int n = 6;
        int x = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                x = x+i;
            }
        }
        if(x == n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
