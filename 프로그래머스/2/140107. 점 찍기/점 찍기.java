class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        // y축에 평행한 선을 오른쪽으로 옮겨가며 그 선의 개수를 더해감 (EX. x=0, x=2 ...)
        for(int x=0; x<=d; x+=k){
            long maxY = (long)Math.sqrt((long)d*d - (long)x*x);
            answer += maxY/k + 1;
        }
        
        return answer;
    }
}