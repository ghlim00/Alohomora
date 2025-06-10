import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        // 기본값
        int[] answer = {0,0};
        
        Set<String> usedWords = new HashSet<>();
        
        char lastChar = ' ';
        
        // 첫 번째 단어 처리
        if(words.length > 0){
            usedWords.add(words[0]);
            lastChar = words[0].charAt(words[0].length()-1);
        }
        
        // 두 번째 단어부터 확인
        for(int i=1; i<words.length; i++){
            String currentWord = words[i];
            
            // 탈락자 발생
            if(usedWords.contains(currentWord) ||
              currentWord.charAt(0) != lastChar ||
              currentWord.length() == 1) {
                
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                
                return answer;
            }
            
            // 끝말잇기 성공
            usedWords.add(currentWord);
            
            lastChar = currentWord.charAt(currentWord.length() - 1);
            
        }

        

        return answer;
    }
}