class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()){
            
           if(c == 'A')
               sb.append('B');
            else
                sb.append('A');
        }
        
        String con = sb.toString();
        return con.contains(pat) ? 1 : 0;
        
        
    }
}