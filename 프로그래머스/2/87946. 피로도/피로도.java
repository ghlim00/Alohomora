import java.util.*;

// 던전 <= 8 이라서 dfs로 충분
// 그냥 dfs-백트래킹 순서 보기

class Solution {
    
    public int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        
        boolean[] used = new boolean[dungeons.length]; // 왔다갔는지 확인
        dfs(k, dungeons, used, 0);
        return max;
        
    }
    
    private void dfs(int k, int[][] dungeons, boolean[] used, int count){ //void
        
        if(count > max) // max값 업데이트
            max = count;

        for(int i=0; i<dungeons.length; i++){ // 그냥 0부터 순서대로
            if(used[i])  // 이미 왔던 곳이면 넘어가기
                continue;
            if(k >= dungeons[i][0]){ // 가능하면 dfs 돌기
                used[i] = true;
                dfs(k-dungeons[i][1], dungeons, used, count+1);
                used[i] = false;
            }
        }
        
    }
}