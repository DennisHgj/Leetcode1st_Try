import java.util.ArrayList;
import java.util.List;

public class LongestSubWithoutRep {
    public int lengthOfLongestSubstring(String s) {
        char [] origin=s.toCharArray();
        int length=0;
        if (origin.length<=1){
            return s.length();
        }

        int j=0;
        List<Character> list=new ArrayList();
        for (int i =0; i<origin.length;i++){
            if (list.size()==0){
                list.add(origin[i]);
                 j =i;
            }else {
                boolean contain= list.contains(origin[i]);
                if (contain){
                    if (list.size()>length){
                        length=list.size();
                    }
                    list.removeAll(list);
                    i=j;

                }else list.add(origin[i]);
                if (i==origin.length-1){
                    if (list.size()>length){
                        length=list.size();
                    }
                }
            }
        }

        return length;
    }
}
