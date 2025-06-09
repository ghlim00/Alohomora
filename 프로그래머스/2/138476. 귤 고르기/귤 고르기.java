import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        // 1. 각 무게당 귤 개수 구하기
        Map<Integer, Integer> map = new HashMap<>();
        for(int fruit : tangerine) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }
        
        // 2. 개수를 기준으로 내림차순 정렬
        List<Integer> list  = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        // 3. k개 이상 되면 그만
        int count = 0;
        int type = 0;
        for(int tang : list){
            count += tang;
            type++;
            
            if(count>=k)
                break;
        }
        
        return type;
    }
}