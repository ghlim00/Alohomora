import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        // 1. 공원과 현재 위치를 저장할 변수 초기화
        int height = park.length;
        int width = park[0].length();
        int row = 0;
        int col = 0;
        
        // 2. 시작 지점 찾기
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                if(park[i].charAt(j) == 'S'){
                //if(park[i][j] == S){ -- string 형식이라 안됨
                    row = i;
                    col = j;
                    break; //로 시간 단축
                }
            }
        }
        
        // 3. 맵에 <방향, 좌표> 저장
        Map<String, int[]> direction = new HashMap<>();
        direction.put("N", new int[]{-1,0});
        direction.put("S", new int[]{1,0});
        direction.put("E", new int[]{0,1});
        direction.put("W", new int[]{0,-1});
        
        
        // 4. 각 명령문 수행
        for(String route : routes){
            
            // 각 명령 방향-거리 분해
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);
            
            // 방향 좌표 꺼내오기
            int[] directionVector = direction.get(dir);
            int dr = directionVector[0];
            int dc = directionVector[1];
            
            // 새롭게 움직일 좌표를 저장할 변수 
            boolean canMove = true;
            int nr = row;
            int nc = col;
            
            for(int i=0; i<dist; i++){
                nr += dr;
                nc += dc;
                
                // 5. 공원을 벗어나거나 벽을 만나는지 확인
                if(nr<0 || nc <0 || nr>=height || nc>=width){
                    canMove = false;
                    break; // break를 걸어줘야 밑에서 인덱스 에러 발생하지 않음
                }
                    
                if(park[nr].charAt(nc) == 'X'){
                    canMove = false;
                    break;
                }
                
            }
            
            // 하나하나의 명령이 가능한 경우에만 좌표 업데이트
            if(canMove){
                row = nr;
                col = nc;
            }
            
        }
        
        return new int[]{row, col};
        
    }
}