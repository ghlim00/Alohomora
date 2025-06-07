import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        
        int answer = 0; // 부서의 개수
        
        for(int i =0; i<d.length; i++){
            if(d[i] <= budget){
                budget -= d[i];
                answer++;
            }
            else 
                break;
        }
        
        return answer;
        
    }
}