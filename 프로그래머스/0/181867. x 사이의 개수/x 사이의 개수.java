class Solution {
    public int[] solution(String myString) {
        
        //-1을 해야 마지막 빈문자열을 버리지 않음
        String[] parts = myString.split("x", -1); 
        int[] answer = new int[parts.length];
        
        for(int i=0; i<parts.length; i++){
            answer[i] = parts[i].length();
        }
        
        return answer;        
        
    }
}