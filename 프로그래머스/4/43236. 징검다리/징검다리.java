import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        
        int len = rocks.length;
        int[] arr = Arrays.copyOf(rocks, len+1); // ! 이렇게 복사해야만,,
        arr[len] = distance;
        Arrays.sort(arr);
        
        int left = 0;
        int right = distance;
        int answer = 0;
        
        while(left <= right){
            int mid = left + (right-left)/2; // 이 값은 (left+right)/2의 값과 동일하나, 오버플로우를 방지하기 위함
            int removed = 0; // 제거된 개수
            int prev = 0; // 이전 출발지
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] - prev < mid){
                    removed++;
                }
                else{
                    prev = arr[i];
                }
                
                if(removed > n)
                    break;
            }
            
            if(removed <= n){ // mid가 정답이 되기 위해 제거해야 할 바위가 적거나 같다 => 거리를 늘려보자~ , = 있으니까 일단 만족
                left = mid+1;
                answer = mid;
            }
            else{ // mid를 만족시킥기 위해 remove되어야 할 바위가 많다 => mid를 줄여야
                right = mid-1;
            }
        }
        
        return answer;
        
    }
}