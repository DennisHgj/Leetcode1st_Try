import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    boolean x = i != j && i != k && j != k && (nums[i] + nums[j] + nums[k] == 0);
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    if (x) {
                        if (lists.isEmpty()) {
                            List<Integer> list = temp;
                            lists.add(list);
                        } else {
                            boolean contain = false;
                            for (int z = 0; z < lists.size(); z++) {
                                List list1 = lists.get(z);
                                list1.sort(Comparator.naturalOrder());
                                temp.sort(Comparator.naturalOrder());
                                boolean y1=list1.equals(temp);

                                boolean y = list1.contains(nums[i]) && list1.contains(nums[j]) && list1.contains(nums[k]);

                                if (y1) {
                                    contain = true;
                                }
                            }
                            if (!contain) {
                                List<Integer> list = new ArrayList<>();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[k]);
                                lists.add(list);
                            }

                        }
                    }
                }
            }
        }
        return lists;
    }

    public static int multi(int n){
        int result=1;
        if (n==0) return 0;
        for (int i =1;i<=n;i++){
            result=result*i;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List list = threeSum(nums);
        List<List<Integer>> lists = new ArrayList<>();
        boolean a = lists.isEmpty();
        System.out.println(list);
    }
}
