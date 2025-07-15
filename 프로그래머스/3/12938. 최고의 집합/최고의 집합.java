import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        
        // 불가능한 경우
        if(n>s)
            return new int[]{-1};
        
        int base = s / n;
        int remain = s % n;
        int[] answer = new int[n];
        
        // 최대한 비슷하게 나누기
        for(int i=0; i<n; i++){
            if(i<n-remain)
                answer[i] = base;
            else
                answer[i] = base + 1;
        }
                
        return answer;
        
    }
}