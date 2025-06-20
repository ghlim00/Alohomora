import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        // 1. 각 알파벳 별 입력 횟수 저장
        Map<Character, Integer> map = new HashMap<>();
        
        for(String keymaps : keymap){
            for(int i=0; i<keymaps.length(); i++){
                char c = keymaps.charAt(i);
                int count = i+1;
                
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), count));
            }
        }
        
        // 타겟 알파벳 확인
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++){
            int sum = 0;
            
            for(char c : targets[i].toCharArray()){
                // contains 아니고 containsKey
                if(map.containsKey(c)){
                    sum += map.get(c);
                }
                else {
                    sum = -1;
                    break;
                }
            }
            
            answer[i] = sum;
        }
        
        return answer;
        
    }
}