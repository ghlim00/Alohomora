import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int sep = commands.length;
        int[] answer = new int[sep];
        
        for(int i=0; i<sep; i++){
            int start = commands[i][0] -1;
            int end = commands[i][1];
            int index = commands[i][2] -1;
            
            // subArray -> Arrays.copyOfRange(arr, s, e)
            int[] sub = Arrays.copyOfRange(array, start, end);
            
            Arrays.sort(sub);
            
            answer[i] = sub[index];
        }
        
        return answer;
    }
}