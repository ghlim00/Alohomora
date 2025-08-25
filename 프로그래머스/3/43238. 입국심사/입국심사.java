import java.util.*;

// 숫자가 큼 주의

class Solution {
    public long solution(int n, int[] times) {
        
        // 1. times 정렬
        Arrays.sort(times);
        
        // 2. 변수 초기화
        long answer = 0;
        long start = 1; // 최소 심사시간
        long end = (long)n * times[times.length-1]; // 최대 심사시간
        
        // 3. 이분탐색 시작
        while(start<=end){
            long mid = (start + end) / 2;  // 중간값
            
            long people = 0;  // 시간 내 처리한 사람 수
            
            for(long time : times){  // 반띵 한 mid 값에 처리할 수 있는 사람 수 더하기
                people += mid/time;
            }
            
            if(people >= n){  // 넘친다 -> 작게 설정
                answer = mid;
                end = mid - 1;
            }
            else {  // 모자르다 -> 크게 설정
                start = mid + 1;
            }
        }
        
        return answer;
    }
}