import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        int N = A.length;

        if (N < 2) {
            return A;
        }

        if (K >= N) {
            while (K >= N) {
                K = K - N;
            }
        }

        int[] left = Arrays.copyOfRange(A, N - K, N);
        int[] right = Arrays.copyOfRange(A, 0, N - K);
        int[] result = new int[N];

        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);

        return result;
    }
}
