import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        
        int r = maps.length;
        int c = maps[0].length;
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        int[][] dist = new int[r][c];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        dist[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int currR = curr[0];
            int currC = curr[1];
            
            if(currR == r-1 && currC == c-1)
                return dist[currR][currC];
            
            for(int i =0; i<4; i++){
                int newR = currR + dx[i];
                int newC = currC + dy[i];
                
                if(newR <0 || newC<0 || newR>=r || newC>=c)
                    continue;
                
                if(maps[newR][newC] == 0 || dist[newR][newC] != 0)
                    continue;
                
                dist[newR][newC] = dist[currR][currC] + 1;
                queue.offer(new int[]{newR, newC});
            }
        }
        
        return -1;
    }
}