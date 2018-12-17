import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1=new ArrayList();
        list.add("abc");
        list1.add("abc");
        boolean x = list.equals(list1);
        System.out.println(x);
    }
}