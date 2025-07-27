class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        // 승패 관계 기록 배열
        boolean[][] graph = new boolean[n+1][n+1];
        
        for(int[] result : results){
            int winner = result[0];
            int loser = result[1];
            graph[winner][loser] = true;
        }
        
        
        // 자기 자신도 항상 이겼다고 처리
        for(int i =1; i<=n ; i++){
            graph[i][i] = true;
        }
        
        // 중간 승패 연결 (중간 - 출발 - 도착 순서)
        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(graph[i][k] && graph[k][j]){
                        graph[i][j] = true;
                    }
                }
            }
        }
        
        // 데칼코마니(이기면 되는 게 아니라 승패만 알면 되니까)
        for(int i=1; i<=n; i++){
            int know = 0;
            
            for(int j=1; j<=n; j++){
                if(graph[i][j] || graph[j][i]){
                    know++;
                }
            }
            
            // 한 명에 대해 다른 사람과의 승패를 다 알고 있음
            if(know == n)
                answer++;
        }
        
        return answer;
    }
}