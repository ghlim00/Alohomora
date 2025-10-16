import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        HashSet<Integer> del = new HashSet<>();
        
        for(int d : delete_list){
            del.add(d);
        }
        
        // del을 set으로
        int len = 0;
        for(int a : arr){
            if(!del.contains(a)) len++;
        }
        
        int[] answer = new int[len];
        int i = 0;
        for(int a: arr){
            if(!del.contains(a)) answer[i++] = a;
        }
        
        return answer;
    }
}