class Solution {
    public int solution(int n) {
        int answer = 1;
        int now = 1;
        
        while(n >= now){
            now = now * answer;
            answer++;
        }
        
        return answer-2;
    }
}