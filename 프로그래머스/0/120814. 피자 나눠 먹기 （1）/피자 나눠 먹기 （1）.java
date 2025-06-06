class Solution {
    public int solution(int n) {
        
        int ans = 1;
        
        while(ans<15){
            if(n <= 7*ans){
                break;
            }
            ans++;
        }
        
        return ans;
    }
}