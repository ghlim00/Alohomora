import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        int count = 0;
        
        for(int i=0; i<photo.length; i++){
            count = 0;
            
            for(String nm : photo[i]){
                count += map.getOrDefault(nm, 0);
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}