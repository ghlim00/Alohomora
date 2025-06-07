class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        
        Long pValue = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            String sub = t.substring(i,i+p.length());
            Long value = Long.parseLong(sub);
            
            if(value<=pValue) answer++;
        }
        
        return answer;
    }
}