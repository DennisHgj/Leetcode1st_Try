public class RemoveDup {
    public int removeDuplicates(int[] nums){
        if (nums.length<=1){
            return nums.length;
        }
        int temp=nums[0];
        int decrease=0;
        int j =1;
        for (int i =1;i<nums.length;i++){
            if (temp==nums[i]){
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
