package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int first = 0;
        int second = 0;
        List<int[]> result = new ArrayList<>();

        while (first < firstList.length && second < secondList.length) {
            int start = Math.max(firstList[first][0],secondList[second][0]);
            int end = Math.min(firstList[first][1],secondList[second][1]);

            if(start <= end) {
                result.add(new int[]{start, end});
            }

            if( firstList[first][1] < secondList[second][1]) {
                first++;
            } else {
                second++;
            }
        }
        return result.toArray(new int[0][]);
    }
}
