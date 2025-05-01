package Tasks;

import java.util.Arrays;

public class Task888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = Arrays.stream(aliceSizes).sum();
        int bobTotal = Arrays.stream(bobSizes).sum();

        for(int i = 0; i < aliceSizes.length; i++) {
            for(int j = 0; j < bobSizes.length; j++) {
                if(aliceTotal - aliceSizes[i] + bobSizes[j] == bobTotal - bobSizes[j] + aliceSizes[i]) {
                    return new int[] {aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}
