import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : num_list){
            set.add(num);
        }
        
        return set.contains(n) ? 1 : 0;
        
    }
}