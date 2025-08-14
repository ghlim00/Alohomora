import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;  // 발음할 수 있는 단어의 개수
        
        for(String word : babbling){
            
            // 반복되는 경우 패스
            if(word.contains("ayaaya") || 
               word.contains("yeye") || 
               word.contains("woowoo") || 
               word.contains("mama")) {
                continue;
            }
            
            // 가능한 발음은 단어에서 제거한다
            // 주의! 'word =' 으로 word 업데이트
            word = word.replace("aya", " ");
            word = word.replace("ye", " ");
            word = word.replace("woo", " ");
            word = word.replace("ma", " ");
            
            // 한 번에 replace로 ""로 바꾸지 않고, " " -> ""로 하는 이유
            // 예를 들어, wayaoo 라는 단어가 주어지면
            // aya  삭제 -> woo 삭제 -> 통과하는 경우가 발생한다.
            word = word.replace(" ", "");
            
            // 다 빠져서 빈 단어가 되면 성공
            if(word.isEmpty())
                answer++;
        }
        
        return answer;
    }
}