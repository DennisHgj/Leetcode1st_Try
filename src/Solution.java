import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int reverse(int x) {

        ArrayList list = new ArrayList();
        if (x>=-Math.pow(2,31)&&x<=Math.pow(2,31)-1){
        double result = 0;
        int fin_r = 0;
        boolean tep = true;
        if (x < 0) {
            tep = false;
            x = Math.abs(x);
        }




            String x_string = String.valueOf(x);
            int j = x_string.length() - 1;
            for (int i = 0; i < x_string.length(); i++) {
                int temp = x_string.length() - 1 - i;
                int i_1 = Integer.valueOf(x_string.charAt(temp)) - '0';
                if (i_1 == '0' && temp == j) {
                    j--;
                } else {
                    list.add(i_1);
                }
            }
            Integer[] int_array = (Integer[]) list.toArray(new Integer[list.size()]);


            for (int z = 0; z < int_array.length; z++) {
                result = result + (int_array[z] * Math.pow(10, list.size() - 1 - z));
            }
            if (tep) {
                fin_r = (int) result;
            } else {
                fin_r = (int) (0 - result);
            }

            if (fin_r>=-Math.pow(2,31)&&fin_r<=Math.pow(2,31)-1){
               return fin_r;
            }else return 0;
        }

        else return 0;
    }

    public static void main(String[] args) {
        int x = -321;
        int y = reverse(x);
        System.out.println(y);
    }
}
