public class check_string_if_contaqins_only_digits {
    public static void main(String[] args) {
        String str = "12345a6";
        boolean flag = false;
        for(int i = 0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                System.out.println("No");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Yes");
        }
    }
}
