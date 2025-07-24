import java.util.*;

class Solution {
    public String solution(int[] food) {
        
        StringBuilder leftSide = new StringBuilder();
        
        int count = 0;
        
        for(int i=1; i<food.length; i++){
            
            count = food[i] / 2;
            
            for(int j=0; j<count; j++){
                leftSide.append(i);
            }
            
        }
        
        StringBuilder rightSide = new StringBuilder(leftSide).reverse();
        
        return leftSide + "0" + rightSide;
    }
}