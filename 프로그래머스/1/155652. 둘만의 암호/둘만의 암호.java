class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            
            int moveCount = 0;
            char curr = ch;
            
            while(moveCount<index){
                curr++; // char도 ++ 이 가능함
                
                // z 넘어가면 a로 수동 변환
                if(curr > 'z')
                    curr = 'a';
                
                // skip에 포함되지 않는다면, index 카운팅은 하지 않음
                if(!skip.contains(String.valueOf(curr)))
                    moveCount++;
            }
            
            sb.append(curr);
            
        }
        
        return sb.toString();
    }
}