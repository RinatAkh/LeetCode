package Tasks;

public class Task977 {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int squaresHighestIndex = nums.length - 1;
        int left = 0, right = nums.length - 1;

        while(left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                squares[squaresHighestIndex--] = leftSquare;
                left++;
            } else {
                squares[squaresHighestIndex--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
