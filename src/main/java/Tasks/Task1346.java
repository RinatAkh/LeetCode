package Tasks;

import java.util.Arrays;

public class Task1346 {
    public static void main(String[] args) {
        int[] array = new int[] {9,-2,-19,15,-14,20,-2};
        System.out.println(checkIfExist(array));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;
            int target = arr[i] * 2;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(arr[mid] == target && i != mid) {
                    return true;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
