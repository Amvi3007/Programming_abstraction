public class first_non_rep {
    public static void main(String[] args) {
        String x = "aabbcde";
        boolean visted[] = new boolean[x.length()];
        for(int  i =0;i<x.length();i++){
            if(visted[i]){
                continue;
            }else{
                int count = 0;
                for(int j = 0;j<x.length();j++){
                    if(x.charAt(i) == x.charAt(j)){
                        count++;
                        visted[j] = true;
                    }
                }
                if(count == 1){
                    System.out.print(x.charAt(i));
                    break;
                }
            }
        }
    }
}
