import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String par : participant){
            map.put(par, map.getOrDefault(par,0) + 1 );
        }
        
        // 같은 맵에 +하거나 -
        for(String com : completion){
            map.put(com, map.get(com) - 1);
        }
        
        // map.keySet() 을 통해 순회하며 -> map.get(key)로 확인
        // getValue()는 Map.Entry 객체에서 쓴다. (밑에 예시)
        for(String key : map.keySet()){
            if(map.get(key) != 0)
                return key;
        }
        
        return "";
    }
}

// for(Map.Entry<String, Integer> entry : map.entrySet()) {
//     if(entry.getValue() != 0) {
//         return entry.getKey();
//     }
// }