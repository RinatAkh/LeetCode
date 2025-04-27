package Tasks;

public class Task35 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,6,7,8,9};
        System.out.println(searchInsert(nums, 6));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return left;
    }
}
