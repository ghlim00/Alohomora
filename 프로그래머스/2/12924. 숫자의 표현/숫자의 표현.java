class Solution {
    public int solution(int n) {
        
        int answer = 0;
        int sum = 0;
        int start = 1;
        int end = 1;
        
        while(end <= n){
            sum += end;
            
            while(sum > n){
                sum -= start;
                start++;
            }
            
            if(sum == n) {
                answer++;
            }
            
            end++;
        }
        
        return answer;
    }
}