class Solution {
    public int solution(int n) {
        
        int answer = 2;
        
        for(int i=1; i<=1000; i++){
            if(n==i*i){
                answer = 1;
                break;
            } 
        }
        
        return answer;
    }
}