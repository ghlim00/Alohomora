import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int len = score.length;
        
        Arrays.sort(score);
        int totalScore = 0;
        
        // len-1 대신 len-m을 사용하개 되면 자동적으로 한 묶음의 첫번째 과일에 접근할 수 있음
        for(int i = len-m; i>=0; i -= m){ 
            totalScore += score[i] * m;
        }
        
        return totalScore;
    }
}