import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                list.add(c - '0');
            }
        }
        
        Collections.sort(list);
        
        int len = list.size();
        int[] answer = new int[len];
        for(int i =0; i<len; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}