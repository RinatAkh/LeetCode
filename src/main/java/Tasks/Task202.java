package Tasks;

public class Task202 {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            fast = findSquareSum(findSquareSum(fast));
            slow = findSquareSum(slow);
        } while (slow != fast);
        return slow == 1;
    }

    private int findSquareSum(int n) {
        int sum = 0, digit;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
