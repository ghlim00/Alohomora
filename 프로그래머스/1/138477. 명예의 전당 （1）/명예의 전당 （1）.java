import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : score){
            pq.offer(s);
            
            if(pq.size() > k)
                pq.poll();
            
            list.add(pq.peek());
        }
        
        int[] answer = new int[score.length];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}