import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int w : works) {
            pq.offer(w);
        }
        
        // n시간 동안 일하기
        for(int i=0; i<n; i++){
            if(pq.isEmpty())
                break;
            
            int max = pq.poll();
            if(max<=0)
                break;
            
            pq.offer(max-1);
        }
        
        long answer = 0;
        
        while(!pq.isEmpty()){
            long work = pq.poll();
            answer += work*work;
        }
        
        return answer;
    }
}