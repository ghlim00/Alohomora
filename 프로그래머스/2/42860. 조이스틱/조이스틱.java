import java.util.*;

// 1. char 단위 - 상하 조이스틱 값을 먼저 계산
// 2. 좌우 조이스틱 값 계산

class Solution {
    public int solution(String name) {
        
        int answer = 0;
        int n = name.length();
        
        // 1번 과정
        for(int i=0; i<n; i++){
            char ch = name.charAt(i);
            int up = ch - 'A';
            int down = 'Z' - ch + 1; // A -> Z 가야 해서 +1
            answer += Math.min(up, down);
        }
        
        // 2번 과정
        int minMove = n-1; //오른쪽으로 순서대로 가는 경우
        for(int i=0; i<n; i++){
            int next = i+1;
            while(next<n && name.charAt(next)=='A'){
                next++;
            }
            
            // i + (n-next) + Math.min(i, (n-next)) 이 부분은 왔다갔다 하는 경우
            // i: 현재 위치(처음->오른쪽으로)
            // n-next: 맨끝->왼쪽으로
            // Math.min(i, (n-next)): 어디를 2번 왔다갔다 하는게 더 빠른가
            minMove = Math.min(minMove, i + (n-next) + Math.min(i, (n-next)));
        }
        
        answer += minMove;
        return answer;
    
    }
}