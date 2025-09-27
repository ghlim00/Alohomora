import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Long> map = new HashMap<>();
        
        // 새로 입력되는 값을 항상 무거운 쪽에 둘 예정 -> 미리 오름차순 정렬
        Arrays.sort(weights);
        
        for(int w : weights){
            
            // 1:1
            answer += map.getOrDefault(w, 0L);
            
            // 1:2
            if(w % 2 == 0){
                int half = w / 2;
                answer += map.getOrDefault(half, 0L);
            }
            
            // 2:3
            if(w % 3 == 0){
                int twoThirds = (w / 3) * 2;
                answer += map.getOrDefault(twoThirds, 0L);
            }
            
            // 3:4
            if(w % 4 == 0){
                int threeQuarters = (w / 4) * 3;
                answer += map.getOrDefault(threeQuarters, 0L);
            }
            
            map.put(w, map.getOrDefault(w, 0L) + 1L);
        
        }
    
        return answer;
        
    }
}