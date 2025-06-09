import java.util.*;

class Solution
{
    public int solution(String s){
        
        // 1. stack 생성
        Stack<Character> stack = new Stack<>();
        
        // 2. stack이 비어있으면 push, 
        //      peek해서 같으면 pop
        for (char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c)
                stack.pop();
            else 
                stack.push(c);
        }
        
        // 3. stack이 비어있으면 1 반환
        return stack.isEmpty() ? 1 : 0;
        
    }
}