class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        // int rem = storey % 10;
        // int div = storey / 10;
        
        while(storey != 0){
            
            int rem = storey % 10;
            int div = storey / 10;
            
            if(rem > 5){
                answer += (10-rem);
                storey = div + 1;
            }
            else if(rem < 5){
                answer += rem;
                storey = div;
            }
            else{
                if(div%10 >= 5){
                    answer += 5;
                    storey = div+1;
                }
                else{
                    answer += 5;
                    storey = div;
                }
            }
        }
         
        return answer;
    }
}