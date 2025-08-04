class Solution {
    public String solution(String X, String Y) {
        
        // 1. 숫자가 등장하는 개수를 저장하기 위한 배열 생성
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for(char c : X.toCharArray()){
            arrX[c - '0']++;
        }
        
        for(char c : Y.toCharArray()){
            arrY[c - '0']++;
        }
        
        
        // 2. 가장 큰 수를 위해 9부터 숫자 추가
        StringBuilder sb = new StringBuilder();
        
        for(int i=9; i>=0; i--){
            int common = Math.min(arrX[i], arrY[i]);  // 중복 개수 처리
            
            for(int j=1; j<=common; j++){
                sb.append(i);
            }
        }
    
        
        // 3. 예외 처리 (예. 000, 빈 배열) 비었는지 먼저 확인
        String answer = sb.toString();
        
        if(answer.length() == 0)  // size 가 아니라 length
            return "-1";
        
        if(answer.charAt(0) == '0') // char니까 '' 붙여줘야 
            return "0";
        
        
        return answer;
        
    }
}