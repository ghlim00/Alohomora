import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville) {
            pq.add(s);
        }
        
        int count = 0;
        
        // 큐에서 두개 빼서 섞은 후 다시 큐에 넣기
        while(pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            
            int mix = first + (second * 2);
            pq.add(mix);
            count++;
        }
        
        // 다 섞었는데도 K보다 작은 경우
        if(pq.peek() < K) {
            return -1;
        }
        
        return count;
    }
}