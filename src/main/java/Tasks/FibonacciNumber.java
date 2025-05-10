package Tasks;

public class FibonacciNumber {
    public static void main(String[] args) {
       System.out.println(fibonacciNumber(4));
    }
    public static int fibonacciNumber(int index) {
        if(index < 0) {
            throw  new IllegalArgumentException("Число не может быть отрицательным");
        }
        if(index == 0) {
            return 1;
        }
        if(index == 1) {
            return 1;
        }
        return fibonacciNumber(index - 1) + fibonacciNumber(index - 2);
    }


}
