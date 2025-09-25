import java.util.*;

class Solution {
    public int solution(int[] topping) {
        
        // key
        // 일단 right 맵에 다 넣어버리고
        // 앞에서부터 순서대로 left 맵에 넣음과 동시에 right에서 제거
        
        int answer = 0;
        
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        
        for(int t : topping){
            right.put(t, right.getOrDefault(t, 0)+1);
        }
        
        for(int i=0; i<topping.length; i++){
            left.put(topping[i], left.getOrDefault(topping[i], 0) + 1);
            
            right.put(topping[i], right.getOrDefault(topping[i], 1) - 1);
            if(right.get(topping[i]) == 0){
                right.remove(topping[i]);
            }
            
            if(left.size() == right.size())
                answer++;
        }
        
        return answer;
    }
}