import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int X, int Y, int D) {
        return (int) (Math.ceil((Y - X) / (double) D));
    }
}
