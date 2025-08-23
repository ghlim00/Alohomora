class Solution {
    public int[] solution(String s) {
        
        int change = 0; // 변환 횟수
        int delete0 = 0; // 삭제된 0의 개수
        
        while(!s.equals("1")){
            
            change++; // 일단 변환++
            
            // 삭제된 0의 개수 구하기
            // 원래 s의 길이와 0을 삭제한 후 길이의 차이
            int originalLen = s.length(); 
            
            s = s.replace("0",""); // 0 삭제
            int newLen = s.length();
            
            int deleted = originalLen - newLen;
            delete0 += deleted;
            
            // 길이 -> 2진법 변환 함수 : Integer.toBinaryString()
            /*만약 내장 함수를 사용하고 싶지 않다면
                (StringBuilder 사용)
                while(n>0){
                    sb.insert(0, n%2)
                    n /= 2
                }
            */
            
            s = Integer.toBinaryString(newLen);  // 내장 함수 버전
        }
        
        return new int[]{change, delete0};
        
    }
}