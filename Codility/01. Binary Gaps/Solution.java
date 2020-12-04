import java.util.*;

class Solution {
    public int solution(int N) {
        ArrayList<Integer> binarized = new ArrayList<Integer>();
        boolean hasStartedCounting = false;

        while (N > 0) {
            int remainder = N % 2;

            if (remainder == 0 && hasStartedCounting) {
                int lastIndex = binarized.size() - 1;
                int currValue = binarized.get(lastIndex) + 1;
                binarized.set(lastIndex, currValue);
            } else if (remainder == 1) {
                binarized.add(0);
                hasStartedCounting = true;
            }

            N = N/2;
        }

        return Collections.max(binarized);
    }
}