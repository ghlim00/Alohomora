import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        // 오답 -> return beforeArr.equals(afterArr) ? 1 : 0;
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}