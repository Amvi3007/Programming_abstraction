public class countfreq {
    public static void main(String[] args) {
        String str = "banana";
        boolean visited[] = new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(visited[i]){
                continue;
            }else{
                int count = 0;
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(count + " "+str.charAt(i));
            }
        }
    }
}
