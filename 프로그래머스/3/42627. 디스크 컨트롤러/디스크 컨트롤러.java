import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        // 1. 일단 요청시간 -> 실행시간 순으로 jobs 정렬하기
        Arrays.sort(jobs, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        // 2. PQ 생성 -> 실행시간 -> 요청시간 순으로 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        
        // 3. 변수 초기화
        int total = 0;
        int idx = 0;
        int time = 0;
        int len = jobs.length;
        
        // 4. PQ에 프로세스 삽입
        while(idx<len || !pq.isEmpty()){
            
            // 4-1. 현재 시간에 도착한 new 프로세스 삽입 (여러개 존재 가능 - if 아닌 while)
            while(idx<len && jobs[idx][0] <= time){
                pq.add(jobs[idx]);
                idx++;
            }
            
            // 4-2. 도착한 프로세스가 없다면 jump!
            if(pq.isEmpty()){
                time = jobs[idx][0];
                continue; // 처리할 프로세스 없으므로 5번 건너뛰기
            }
            
            // 5. 프로세스 pq에서 하나씩 처리하기
            int[] now = pq.poll();
            time += now[1];
            total += (time - now[0]);
        }
        
        return (int) total / len;
    }
}