import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int answer = 0;
        int row = board.length;
        int col = board[0].length;
        
        String color = board[h][w];
        
        // == 이 아니고 equals 주의
        if(h-1>=0){
            if(color.equals(board[h-1][w]))
                answer++;
        }
        if(h+1<row){
            if(color.equals(board[h+1][w])) 
                answer++;
        }
        if(w-1>=0){
            if(color.equals(board[h][w-1]))
                answer++;
        }
        if(w+1<col){
            if(color.equals(board[h][w+1]))
                answer++;
        }
        
        return answer;
    }
}