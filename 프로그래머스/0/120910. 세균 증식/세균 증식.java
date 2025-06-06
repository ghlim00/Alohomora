import java.util.*;

class Solution {
    public int solution(int n, int t) {
        
        int answer = n;
        int i = 1;
        
        while(i<= t){
            answer *= 2;
            i++;
        }
        
        return answer;
    }
}