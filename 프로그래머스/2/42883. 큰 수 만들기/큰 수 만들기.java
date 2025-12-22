import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            
            // 1. 아직 k번 삭제 안했는지
            // 2. 날릴 문자가 있는지 
            // 3. 새 문자와 비교하여 가장 오른쪽 문자 날리기
            while(k>0 && sb.length() > 0 && ch > sb.charAt(sb.length()-1)){
                k--;
                sb.deleteCharAt(sb.length()-1); // stringbuilder의 n번 인덱스 문자 날리기
            }
            sb.append(ch);
        }
        
        // 아직 k개 다 못날렸으면 [k만큼 뺀 길이로] number 뒤에 짜르기
        if(k>0) sb.setLength(sb.length() - k);
        return sb.toString();
    }
    
}