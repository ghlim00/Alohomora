import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        // 1. 로또 번호 set에 넣기
        HashSet<Integer> set = new HashSet<>();
        for(int nums : win_nums){
            set.add(nums);
        }
        
        // 2. 현재 0이 몇개인지, 맞은 번호가 몇개인지
        int zero = 0;
        int match = 0;
        
        for(int n : lottos){
            if(n==0){
                zero++;
            }
            else{
                if(set.contains(n)){
                    match++;
                }
            }
        }
        
        // 3. 순위 출력
        int low = match;
        int high = match + zero;
        
        int[] rank = {6,6,5,4,3,2,1};
            
        return new int[] {rank[high], rank[low]};
    }
}