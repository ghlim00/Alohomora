import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array); 
        // Arrays.sort(arr, Collections.reverseOrder());
        answer = array[array.length/2];
        
        return answer;
    }
}