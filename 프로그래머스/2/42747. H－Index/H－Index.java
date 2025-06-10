import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        int cit = citations.length;
        int hIndex = 0;
        
        for(int i=0; i<cit; i++){
            if(citations[i] >= (cit-i)){
                hIndex = cit-i;
                break;
            }
        }
        
        return hIndex;
        
    }
}