import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        
        // (예약 시간을) 시작 시간 기준 정렬
        Arrays.sort(book_time, (a,b) -> invert(a[0]) - invert(b[0]));
        
        // (청소 포함) 끝나는 시간을 오름차순으로 정렬하기 위해 우선순위 큐 사용
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(String book[] : book_time){
            int start = invert(book[0]);
            int end = invert(book[1]) + 10;
            
            // 새로운 예약의 시간 >= 청소가 가장 빨리 끝나는 방 => 그 방을 쓴다
            if(!pq.isEmpty() && pq.peek() <= start){
                pq.poll();
            }            
            
            // 끝나는 시간을 큐에 저장
            pq.offer(end);
        }
        
        return pq.size();
    }
    
    // 시간을 분단위로 계산
    private int invert(String time){
        String[] clock = time.split(":");
        return Integer.parseInt(clock[0])*60 + Integer.parseInt(clock[1]);
    }
}