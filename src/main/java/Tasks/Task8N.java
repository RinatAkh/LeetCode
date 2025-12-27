package Tasks;

public class Task8N {
    public void printArrayColumn(int[][] array) {
        int i = 0;
        while(array.length > i) {
            System.out.println(array[i][2]);
            i++;
        }
    }

    public void printArrayRow(int[][] array, int row) {
        int i = 0;
        while(array[row].length > i) {
            System.out.println(array[row][i]);
            i++;
        }
    }
}
