import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i= n-1; i>=0; i--){
            
            while(!st.isEmpty() && numbers[i] >= st.peek()){
                st.pop();
            }
            
            answer[i] = st.isEmpty() ? -1 : st.peek();
            
            st.push(numbers[i]);
        }
        
        return answer;
    }
}