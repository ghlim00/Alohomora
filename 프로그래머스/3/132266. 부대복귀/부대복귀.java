import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        
        // 1. 리스트 생성 (지역 넘버는 1부터 시작)
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        // 2. 구역 연결하기
        for(int[] road : roads){
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        
        // 3. 각 구역까지의 거리 저장
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1); // 초기화
        
        // 4. Queue로 연결 관리
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(destination); 
        dist[destination] = 0;
        
        // 5. destination에서 출발해서 거리를 추가하며 걷는다
        while(!queue.isEmpty()){
            int now = queue.poll();
            for(int next : graph.get(now)){
                if(dist[next] == -1){
                    dist[next] = dist[now] + 1;
                    queue.add(next);
                }
            }
        }
        
        // 6. dist 배열에서 source 에 해당하는 부분 찾아오기
        int[] answer = new int[sources.length];
        for(int i =0; i<sources.length; i++){
            answer[i] = dist[sources[i]];
        }
        
        return answer;
    }
}