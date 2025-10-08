class Solution {
    public int[][] solution(int[][] arr) {
        // 빈 배열은 자동으로 0으로 채워짐
        
        int row = arr.length;
        int col = arr[0].length;
        int max = Math.max(row, col);
        
        int[][] answer = new int[max][max];
        
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                answer[r][c] = arr[r][c];
            }
        }
        
        return answer;
    }
}