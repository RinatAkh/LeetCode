package Tasks;

public class Task2540 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 5};
        int[] nums2 = new int[]{2};
        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++) {
            int left = 0;
            int right = nums2.length;
            while(left < right) {
                int mid = (left + right) / 2;
                if(nums2[mid] == nums1[i]) {
                    return nums1[i];
                } else if(nums2[mid] < nums1[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
