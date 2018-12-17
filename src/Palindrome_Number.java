import java.util.ArrayList;

public class Palindrome_Number {
    public boolean isPalindrome(int x){
        boolean isPalindrome = false;
        ArrayList list= new ArrayList();
        ArrayList reverse_list = new ArrayList();
        if (x>=0){
            String x_string = String.valueOf(x);
            for (int i = 0;i<x_string.length();i++){
                list.add(x_string.charAt(i));
                reverse_list.add(x_string.charAt(x_string.length()-1-i));
            }
            if (list.equals(reverse_list)){
                isPalindrome=true;
            }

        }
        return isPalindrome;
    }
}
