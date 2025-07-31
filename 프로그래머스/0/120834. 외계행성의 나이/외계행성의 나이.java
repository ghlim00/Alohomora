class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        // 0 + 'a' = 'a' 라는 것을 활용
        
        String ageStr = String.valueOf(age); 
        
        for(char ch : ageStr.toCharArray()){
            
            int now = Character.getNumericValue(ch);
            
            char nnow = (char)(now + 'a');
            
            sb.append(nnow);
                
        }
        
        return sb.toString();
    }
}