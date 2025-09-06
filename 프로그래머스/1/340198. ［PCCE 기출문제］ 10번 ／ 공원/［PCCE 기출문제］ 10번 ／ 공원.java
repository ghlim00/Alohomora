import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        int row = park.length;
        int col = park[0].length;
        
        // 이미 String[][]이라 복사할 필요 없음
//         String[][] map = new String[row][col];
        
//         for(int r=0; r<row; r++){
//             for(int c=0; c<col; c++){
//                 map[r][c] = park[r].charAt(c).toString();
//             }
//         }
        
        Arrays.sort(mats);
        
        for(int i=mats.length-1; i>=0; i--){
            int one = mats[i];
            for(int r=0; r<row; r++){
                for(int c=0; c<col; c++){
                    if(possible(park, r, c, one)){
                        return one;
                    }
                }
            }
        }
        
        return -1;
    }
    
    // 노가다 메서드 분리
    private boolean possible(String[][] map, int r, int c, int one){
        
        for(int i=r; i<r+one; i++){
            for(int j=c; j<c+one; j++){
                // equals 주의, 순서 주의
                if(i>=map.length || j>=map[0].length || !map[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}