import java.util.*;

class Solution {
    public int solution(int n) {
        
//         // 1. 메서드 사용 방식
//         String base3 = Integer.toString(n,3);
        
//         String reversed = new StringBuilder(base3).reverse().toString();
        
//         return Integer.parseInt(reversed,3);
        
        // 2. 진법 변환 x
        String reversed3 = "";
        while(n>0){
            reversed3 += n%3;
            n /= 3;
        }
        
        // 뒤집히지 않은 3진법 만들기
        // StringBuilder base3 = new StringBuilder();
        //     while (n > 0) {
        //         base3.append(n % 3);
        //         n /= 3;
        //     }
        // String normalBase3 = base3.reverse().toString(); 
        
        int answer = 0;
        int power = 1;
        
        for(int i = reversed3.length() - 1; i>=0; i--){
            int digit = reversed3.charAt(i) - '0';
            answer += digit * power;
            power *= 3;
        }
        
        return answer;
    }
}