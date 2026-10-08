public class remove_duplic_string {
    public static void main(String[] args) {
        String str = "programming";
        boolean visited[] = new boolean[str.length()];
        StringBuilder st = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(visited[i]){
                continue;
            }else{
                for(int j = i+1;j<str.length();j++){
                    if(str.charAt(i) == str.charAt(j)){
                        visited[j] = true;
                    }
                }
                st.append(str.charAt(i));
            }
        }
        System.out.println(st.toString());
    }
}
