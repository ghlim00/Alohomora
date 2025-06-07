import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                result[i] = i - map.get(c);
            }
            else {
                result[i] = -1;
            }
            
            map.put(c, i);
        }
        
        return result;
    }
}