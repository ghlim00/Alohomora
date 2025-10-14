import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int n = progresses.length;
        int[] todo = new int[n];
        
        for(int i=0; i<n; i++){
            int remain = 100 - progresses[i];
            todo[i] = (remain + (speeds[i]-1)) / speeds[i]; 
            // speeds[i]-1을 더해주는 이유 : 올림 처리를 위해서
        }
        
        List<Integer> list = new ArrayList<>();
        
        int count=1;
        int threshold = todo[0];
        
        for(int i=1; i<n; i++){
            if(todo[i] <= threshold){
                count++;
            }
            else{
                list.add(count);
                threshold = todo[i];
                count = 1;
            }
        }
        list.add(count); // 마지막 순환의 count 추가
        
        int len = list.size();
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}