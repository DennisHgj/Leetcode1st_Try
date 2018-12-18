public class MedianOf2SortedArrarys {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length+nums2.length];
        double result = 0.0;
        double median1 = 0;
        double median2 = 0;
        if (nums1.length == 0) {
            result = findMedian(nums2);
        } else if (nums2.length == 0) {
            result = findMedian(nums1);
        } else {
            int i = 0,j = 0,k = 0;
            while(i<nums1.length && j<nums2.length){
                if(nums1[i] <= nums2[j])
                    nums3[k++] = nums1[i++];
                else
                    nums3[k++] = nums2[j++];
            }
            while(i < nums1.length) nums3[k++] = nums1[i++];
            while(j < nums2.length) nums3[k++] = nums2[j++];
            result=findMedian(nums3);
        }


        return result;
    }

    public static double findMedian(int[] nums) {
        double result = 0.0;
        if (nums.length != 1) {
            if (nums.length % 2 == 0) {
                result = (double)((nums[(nums.length) / 2 - 1]) + (nums[nums.length / 2])) / 2;
            } else {
                result = nums[nums.length / 2];
            }
        } else result = nums[0];

        return result;
    }

    public static void main(String[] args) {
        int []num1={1,2};
        int []num2={3,4};
        double median=findMedianSortedArrays(num1,num2);
        System.out.println(median);
    }
}
