class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        int now = n;
        
        while(now>=a){
            //받는거
            answer += (b*(now/a));
            //남는거
            now = (now%a) + (b*(now/a));
        }
        
        return answer;
    }
}