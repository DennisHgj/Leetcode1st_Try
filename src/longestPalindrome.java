public class longestPalindrome {
    public static String longestPalindrome(String s) {
        int length=0;
        char [] origin = s.toCharArray();
        String s1="";
        if (s.length()<=1){
            return s;
        }
        Loop:for (int i = 0; i<origin.length;i++){
            for (int j = origin.length-1;j>i;j--){
                if (origin[i]==origin[j]){
                    if (isPalindrome(s.substring(i,j+1))){
                        if (s.substring(i,j+1).length()>length){
                            s1=s.substring(i,j+1);
                            length=s1.length();
                        }
                        continue Loop;
                    }
                }
            }
        }
        return s1;
    }

    public static boolean isPalindrome(String s){
        for (int i = 0 ; i<=s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a="cbbd";
        String a1 = longestPalindrome(a);
        System.out.println(a1);
    }
}
