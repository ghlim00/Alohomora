class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i =1; i<= number; i++){
            int divisor = countDivisors(i);
            
            if(divisor>limit)
                answer += power;
            else
                answer += divisor;
        }
        
        return answer;
    }
    
    private int countDivisors(int n){
        
        int count = 0;
        
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i*i == n){
                    count += 1;
                }
                else 
                    count += 2;
            }
        }
        
        return count;
    }
}