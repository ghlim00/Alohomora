class Solution {
    public boolean solution(String s) {
        
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6) answer = false;
        
        if(!s.matches("[0-9]+")) answer = false; // 숫자 구성 확인
        
        return answer;
    }
}