class Solution {
    public int[] solution(long n) {
        
        // long은 length 속성 없음
        String len = Long.toString(n);
        int[] answer = new int[len.length()];
        
        for(int i=0; i<len.length(); i++){
            answer[i] = len.charAt(len.length()-1-i) - '0';
        }
        
        return answer;
        

        
        // long → String	
        // Long.toString(n) or String.valueOf(n)
        
        // String → long	
        // Long.parseLong(s)
        
        
        // length 사용 예시
        // 배열       → .length      (속성, 괄호 없음)
        // String    → .length()    (메서드, 괄호 O)
        // ArrayList → .size()      (메서드, 괄호 O)
        // StringBuilder → .length() (메서드, 괄호 O)
        // 기본형     → .length, .length() 둘 다 불가

    }
}