import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int index = 1;
        
        int len = s.length();
        
        for(int i =0; i<len; i++){
            char ch = s.charAt(i);
            
            if(ch==' '){
                index=1;
                sb.append(' ');
            } 
            else {
                if(index%2==1){
                    sb.append(Character.toUpperCase(ch));
                }
                else {
                    sb.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }
        
        return sb.toString();
        
    }
}