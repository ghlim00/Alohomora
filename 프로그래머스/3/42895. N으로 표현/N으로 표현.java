import java.util.*;

class Solution {
    public int solution(int N, int number) {
        
        // 1. 같다면 바로 return 
        if(N == number)
            return 1;
        
        // 2. N별로 set을 생성하기 위한 list 생성
        List<Set<Integer>> dp = new ArrayList<>();
        
        // 3. i개의 N으로 이루어진 숫자 add
        int curr = 0;
        for(int i=0; i<9; i++){  // 1부터하면 index error (나중에 dp.get(0) 할 때 error 가능성)
            dp.add(new HashSet<>());
            if(i!=0){
                curr = curr * 10 + N;
                dp.get(i).add(curr);
            }
        }
        
        // 위에 넣으니까 error - 아닐수도
        // int curr = 0;
        // for(int i=1; i<9; i++){
        //     curr = curr * 10 + N;
        //     dp.get(i).add(curr);
        // }
        
        // 4. DP 시작
        for(int i=1; i<9; i++){
            for(int j=1; j<=i; j++){
                Set<Integer> set1 = dp.get(j);
                Set<Integer> set2 = dp.get(i-j);
                
                for(int num1 : set1){
                    for(int num2 : set2){
                        dp.get(i).add(num1 + num2);
                        dp.get(i).add(num1 - num2);
                        dp.get(i).add(num1 * num2);
                        if(num2 != 0)
                            dp.get(i).add(num1/num2);
                    }
                }
                
                if(dp.get(i).contains(number))
                    return i;
            }
        }
        
        return -1;
    }
}