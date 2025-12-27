package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        int i = 0;
        // Добавляем интервалы до минимального значения newIntervals
        while(i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i++]);
        }
        // Тут мы дошли до начала пересечения, и теперь мы сравниваем между собой элементы
        // для того чтобы расширить инетрвал при необходимости
        while (i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }

        result.add(new int[]{start, end});

        while (i < intervals.length)
            result.add(intervals[i++]);

        return result.toArray(new int[result.size()][]);
    }
}
