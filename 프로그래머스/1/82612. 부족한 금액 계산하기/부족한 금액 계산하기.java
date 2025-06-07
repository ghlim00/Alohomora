class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = 0;
        
        int i =1;
        while(i <= count){
            answer += price*i;
            i++;
        }
        
        answer -= money;
        
        if(answer<0) return 0;

        return answer;
    }
}