import java.util.*;

class Solution {
    
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};    
    
    public int solution(String[] maps) {
        int answer = 0;
        int row = maps.length;
        int col = maps[0].length();
        
        int sr = -1;
        int sc = -1;
        int lr = -1;
        int lc = -1;
        int er = -1;
        int ec = -1;
        
        // S, L, E 위치 초기화
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                char ch = maps[r].charAt(c);
                if(ch == 'S'){
                    sr = r;
                    sc = c;
                }
                else if(ch == 'L'){
                    lr = r;
                    lc = c;
                }
                else if(ch == 'E'){
                    er = r;
                    ec = c;
                }
            }
        }
        
        // S->L, L->E 따로따로
        int s2l = bfs(maps, sr, sc, 'L');
        if(s2l == -1) return -1;
        
        int l2e = bfs(maps, lr, lc, 'E');
        if(l2e == -1) return -1;
        
        return s2l + l2e;
    }
    
    
    private int bfs(String[] maps, int sr, int sc, char target){
        int row = maps.length;
        int col = maps[0].length();
        
        //방문배열, 큐 생성
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();
        
        // 큐에 시작점 넣고, 시작점 방문처리
        queue.offer(new int[]{sr, sc, 0});
        visited[sr][sc] = true;
        
        // 큐 돌리기
        while(!queue.isEmpty()){ 
            
            // 현재 값 추출
            int[] curr = queue.poll();
            int cr = curr[0];
            int cc = curr[1];
            int cd = curr[2];
            
            // !! (위치 여기) 도착했으면 return 
            if(maps[cr].charAt(cc) == target) return cd;
            
            // 사방탐색
            for(int i=0; i<4; i++){
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                
                // 범위, 방문, 조건 확인
                if(nr<0 || nc<0 || nr>=row || nc>=col) continue;
                if(visited[nr][nc]) continue;
                if(maps[nr].charAt(nc) =='X') continue;
                // 방문 처리 및 새로운 큐
                visited[nr][nc] = true;
                queue.offer(new int[]{nr, nc, cd+1});
            }  
        }
        
        return -1;
    }
}