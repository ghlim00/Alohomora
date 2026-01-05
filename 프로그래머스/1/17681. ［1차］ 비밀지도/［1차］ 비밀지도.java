class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            
            // 1. 2진수 String으로 변환
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            // 2. 자릿수 맞추기 ex)"%5s"
            String formatted = String.format("%" + n + "s", binary);
            
            // 3. 형식 맞추기
            answer[i] = formatted.replace('1', '#').replace('0', ' ');
            
        }        
        
        return answer;
    }
}