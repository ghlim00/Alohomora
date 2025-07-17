import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int light = 0;
        int heavy = people.length-1;
        int answer = 0;
        
        while(light <= heavy){
            
            // 가벼운 사람 + 무거운 사람이 같이 탈 수 있다면 가벼운 사람 태움
            if(people[light] + people[heavy] <= limit)
                light++;
            
            heavy--; // 무거운 사람은 무조건 태움
            
            answer++;
        }
        
        return answer;
    }
}