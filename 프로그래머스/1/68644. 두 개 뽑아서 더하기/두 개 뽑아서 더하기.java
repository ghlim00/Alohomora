import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
            
        for(int i =0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }        
        }
        
        // set -> list
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        // list -> 배열
        int[] answer = new int[set.size()];
        for(int i =0; i<set.size(); i++){
            answer[i]  = list.get(i);
        }
        
        return answer;
        
    }
}