class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int same = 0;
        int diff = 0;
        char x = s.charAt(0); // x 초기화
        
        for(int i =0 ;i< s.length(); i++){
            
            char ch = s.charAt(i);
            
            // 뭉탱이의 첫 알파벳
            if(same == 0 && diff == 0){
                x = ch;
            }
            
            // 같다면 same증가, 다르면 diff 증가
            if(x == ch){
                same++;
            }
            else {
               diff++; 
            }
            
            // 한 뭉탱이가 됨 -> answer++, 뭉탱이 초기화
            if(same == diff){
                answer++;
                same = 0;
                diff = 0;
            }
        }
        
        // 마지막에 짝이 안지어진채로 그냥 남아버렸다면
        if(same != 0)
            answer++;
        
        return answer;
        
    }
}