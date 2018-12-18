public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length<=0){
            return nums.length;
        }
        int temp=nums[0];
        int decrease=0;
        int j =0;
        for (int i =0;i<nums.length;i++){
            if (val==nums[i]){
                decrease++;
            }else {
                temp=nums[i];
                nums[j]=temp;
                j++;
            }
        }
        temp=nums.length-decrease;

        return temp;
    }
}
