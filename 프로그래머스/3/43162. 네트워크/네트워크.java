import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int networks = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, n, visited, computers);
                networks++;
            }
        }
        
        return networks;
    }
    
    private void dfs(int i, int n, boolean[] visited, int[][] computers){
        visited[i] = true;
        
        for(int k=0; k<n; k++){
            if(!visited[k] && computers[i][k] == 1){
                dfs(k, n, visited, computers);
            }
        }
    }
}