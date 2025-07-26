import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        
        int len = list.size();
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}