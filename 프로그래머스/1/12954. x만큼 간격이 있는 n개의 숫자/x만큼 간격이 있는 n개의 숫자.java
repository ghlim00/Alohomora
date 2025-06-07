class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n];
        
        long value = 0;
        for(int i =0; i<n; i++){
            value += x;
            answer[i] = value;
        }
        
        return answer;
        
    }
}