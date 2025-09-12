import java.util.*;

class Solution {
    public int solution(String dartResult) {
        
        int[] arr = new int[3]; //3번 던지니까
        int index = -1;         // 지금 몇번째 기회?
        
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(Character.isDigit(ch)){
                index++;
                if(ch=='1' && (i+1)<dartResult.length() && dartResult.charAt(i+1)=='0'){
                    arr[index] = 10;
                    i++;
                }
                else{
                    arr[index] = ch - '0';
                }
            }
            
            if(ch == 'S' || ch=='D' || ch=='T'){
                int multiple = (ch=='S') ? 1 : (ch=='D') ? 2 : 3;
                arr[index] = (int)Math.pow(arr[index], multiple);
            }
            
            if(ch=='*'){
                arr[index] *= 2;
                if(index>0)
                    arr[index-1] *= 2;
            }
            
            if(ch=='#'){
                arr[index] *= -1;
            }
        }
        
        return arr[0]+arr[1]+arr[2];
    }
}