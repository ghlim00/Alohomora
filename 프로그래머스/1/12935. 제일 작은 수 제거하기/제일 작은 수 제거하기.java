import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        
        if(len==1) return new int[]{-1};
        
        // 제일 작은 수 찾기
        int min = arr[0];
        for(int i=1; i<len; i++){
            min = Math.min(min, arr[i]);
        }
        
        // 작은 수 제외하고 list에 추가
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<len; i++){
            if(arr[i] != min) list.add(arr[i]);
        }
        
        // list -> arr
        int[] answer = new int[len-1];
        for(int i=0; i<len-1; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}