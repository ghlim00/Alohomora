import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        // 1. 문자열 변환
        String[] num = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        
        // 2. 정렬
        Arrays.sort(num, (a,b) -> (b+a).compareTo(a+b));
        
        if(num[0].equals("0")) return "0";
        
        // 3. 합치기
        StringBuilder sb = new StringBuilder();
        for(String n : num){
            sb.append(n);
        }
        
        return sb.toString();
    }
}