import java.util.*;

class Solution {
    public long solution(long n) {
        
        String num = Long.toString(n);
        
        char[] arr = num.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr)).reverse();
        
        long answer = Long.parseLong(sb.toString());
        
        return answer;
        
    }
}