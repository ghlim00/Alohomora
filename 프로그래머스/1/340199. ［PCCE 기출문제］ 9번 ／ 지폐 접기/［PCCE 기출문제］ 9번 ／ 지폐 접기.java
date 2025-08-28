import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while(true){
            if(wallet[1] < bill[1]){
                bill[1] /= 2;
                answer++;
                Arrays.sort(bill);
            }   
            else{
                if(wallet[0] >= bill[0])
                    return answer;
                else{
                    bill[1] /= 2;
                    answer++;
                    Arrays.sort(bill);
                }
            }
        }
    }
}