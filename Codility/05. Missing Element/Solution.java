import java.util.*;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        if (N == 0) {
            return 0;
        }

        int base = ((N + 1) * (N + 2)) / 2;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        return base - sum;
    }
}
