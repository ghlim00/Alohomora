import java.util.*;

public class Solution {
    public int solution(int n) {
        
        // 방법1
        int answer = 0;
        
        while(n>0) {
            answer += n%10;
            n /= 10;
        }
        
//         방법2
//         String str = Integer.toString(n);
//         for(int i=0; i<str.length(); i++){
//             answer += Character.getNumericValue(str.charAt(i));
//         }
        
        
        
// 형변환        
//         int num = 123;
//         char ch = '5';
//         String str = "456";

//         // int ↔ String
//         String numStr = Integer.toString(num);
//         int strNum = Integer.parseInt(str);

//         // char ↔ String
//         String charStr = Character.toString(ch);
//         char firstChar = str.charAt(0);

//         // char ↔ int
//         int charToInt = Character.getNumericValue(ch); // or ch - '0'
//         char intToChar = (char)(3 + '0'); // '3'
        
        return answer;
    }
}