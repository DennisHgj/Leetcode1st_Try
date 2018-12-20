import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        String a[]={"a1","cd","ef"};
        char s = a[0].charAt(1);
        System.out.println(s);
        int s1 = (int)s;
        System.out.println(s1);
        char s2 =(char)s1;
        System.out.println(s2);
        Set set = new TreeSet();
        set.add(a[1]);
        System.out.println(set.toString());
        set.remove(a[1]);
        System.out.println(set.toString());
        List list = new ArrayList();
        list.add(a[1]);
        System.out.println(list);
        System.out.println(list.get(0));
        list.removeAll(list);
        System.out.println(list);
        list.add(a[0]);
        list.add(a[1]);
        list.add(a[2]);
        System.out.println(list);
        List list1=new ArrayList();
        list1.add('1');
        list=list1;
        System.out.println(list);
        int b= 3/2;
        System.out.println(b);

        String s3="abcde";
        System.out.println(s3.substring(1,4));



    }
}
