class Solution {
    public int solution(String[] s1, String[] s2) {
        
        int answer = 0;
        
        for(String sone : s1){
            for(String stwo : s2){
                if(sone.equals(stwo)){
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}