class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
            }
            else {
                count--;
            }
            
            if(count<0)
                return false;
        }

        return count==0;
    }
}