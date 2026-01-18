import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 1. 회전한 문자열 생성
        for(int i=0; i<s.length(); i++){
            String rotate = s.substring(i) + s.substring(0,i);
            
            if(isValid(rotate)) answer++;
        }
        
        return answer;
    }
    
    // 2. 유효성 검사
    private boolean isValid(String s){
        
        // 3. 한 글자씩 스택 검사
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            // 4. 여는 괄호면 스택에 넣기
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            // 5. 닫는 괄호라면 조건 검사
            else{
                
                if(stack.isEmpty()) return false;
                
                Character p = stack.pop();
                if(c == ')' && p != '(') return false;
                if(c == '}' && p != '{') return false;
                if(c == ']' && p != '[') return false;
            }
        }
        return stack.isEmpty();  // 완료 시 스택이 비어있어야 함
    }
}