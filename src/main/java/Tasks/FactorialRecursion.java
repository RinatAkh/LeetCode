package Tasks;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int index) {
        if(index == 1) return 1;
        return index * factorial(index - 1);
    }
}
