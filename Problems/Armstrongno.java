public class Armstrongno {
    public static void main(String[] args) {
        int n = 125;
        int og = n;
        double x = 0;
        double count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }

        int og2 = og;
        while(og>0){
            double ld = og%10;
            x = x + Math.pow(ld,count);
            og = og/10;
        }

        System.out.print(x == og2);
    }
}
