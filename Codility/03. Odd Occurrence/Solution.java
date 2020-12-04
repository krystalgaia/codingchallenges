import java.util.*;

class Solution {
    public int solution(int[] A) {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (table.get(A[i]) != null) {
                table.remove(A[i]);
            } else {
                table.put(A[i], A[i]);
            }
        }

        return table.elements().nextElement();
    }
}
