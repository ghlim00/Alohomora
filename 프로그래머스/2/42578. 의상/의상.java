import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> map = new HashMap<>();
        
        // 타입별로 몇 가지 보유하는지
        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }
        
        int answer = 1;
        
        // 착용하지 않을 수도 있으니 +1
        for(int count : map.values()){
            answer *= (count + 1);
        }
            
        return answer -1;
    }
}