package Tasks;

public class Task7N {
    public double dividingNumbers(int[][] array, int[] firstNumber, int[] secondNumber) {
        int firstElement = array[firstNumber[0]][firstNumber[1]];
        int secondElement = array[secondNumber[0]][secondNumber[1]];
        return (double) firstElement / secondElement;
    }

    public double dividingNumbersAvg(int[][] array, int[] firstNumber, int[] secondNumber) {
        int firstElement = array[firstNumber[0]][firstNumber[1]];
        int secondElement = array[secondNumber[0]][secondNumber[1]];
        return (double) (firstElement / secondElement) / 2;
    }
}
