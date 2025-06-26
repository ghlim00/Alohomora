import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        
        int len = t.length();
        int[] dp = new int[len+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=0; i<len; i++){
            if(dp[i] == Integer.MAX_VALUE) continue;
            
            for(String s : strs){
                int end = i + s.length();
                if(end > len) continue;
                
                if(t.substring(i, end).equals(s)){
                    dp[end] = Math.min(dp[end], dp[i] + 1);
                }
            }
        }
        
        return dp[len] == Integer.MAX_VALUE ? -1 : dp[len];
    }
}