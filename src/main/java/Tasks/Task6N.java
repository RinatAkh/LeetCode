package Tasks;

public class Task6N {
    public int[][] changeArray(int[][] array) {
        int arrayLength = array.length - 1;
        int first = array[0][array[0].length - 1];
        int second = array[arrayLength][0];

        array[0][array[0].length - 1] = second;
        array[arrayLength][0] = first;

        int third = array[0][0];
        int forth = array[arrayLength][array[arrayLength].length - 1];

        array[0][0] = forth;
        array[arrayLength][array[arrayLength].length - 1] = third;

        return array;
    }

}
