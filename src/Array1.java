import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int i = 0;

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List result = new ArrayList();
        List origin = new ArrayList<Integer>();
        /*while (in.hasNextInt()) {
            if (in.nextInt() < 0) {
                list2.add(in.nextInt());
            } else {
                list1.add(in.nextInt());
            }
        }*/
        String input = in.nextLine();
        String Array[]= input.split(" ");
        int [] inttemp = new int[Array.length];
        for (int tmp1=0;tmp1<Array.length;tmp1++){
            inttemp[tmp1]=Integer.parseInt(Array[tmp1]);
        }

        for (int tmp = 0 ;tmp<inttemp.length;tmp++){
            if (inttemp[tmp]<0){
                list2.add(inttemp[tmp]);
            }else{
                list1.add(inttemp[tmp]);
            }
        }
        int total_size = list1.size() + list2.size();

        if (list1.size()==0){
            result=list2;
        }else if(list2.size()==0){
            result=list1;
        }else {


            if (list1.size() <= list2.size()) {
                for (int i = 0; i < list1.size(); i++) {
                    result.add(list1.get(i));
                    result.add(list2.get(i));
                    if (i == list1.size() - 1) {
                        for (int j = i + 1; j < list2.size(); j++) {
                            result.add(list2.get(j));
                        }
                    }
                }
            } else {
                for (int i = 0; i < list2.size(); i++) {
                    result.add(list1.get(i));
                    result.add(list2.get(i));
                    if (i == list1.size() - 1) {
                        for (int j = i + 1; j < list1.size(); j++) {
                            result.add(list1.get(j));
                        }
                    }
                }
            }
        }
        for (int z = 0; z < result.size(); z++) {
            System.out.print(result.get(z) + " ");
        }
    }
}
