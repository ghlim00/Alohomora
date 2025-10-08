class Solution {
    public int[] solution(int n) {
        
        // 삼각형 사이즈 - n개로 시작해서 한 번 방향을 틀 때 마다 -1크기가 됨
        // n + (n-1) + (n-2) + (n-3) + ... + 1
        int size = n * (n+1) / 2;
        
        // 실제 삼각형은 직각삼각형 배열로 채워짐 |\ 모양
        int[][] arr = new int[n][n];
        
        // 삼각달팽이
        int row = -1;
        int col = 0;
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int dir = i%3;
                if(dir==0){
                    row++;
                } else if(dir==1){
                    col++;
                } else{
                    row--;
                    col--;
                }
                arr[row][col] = num++;
            }
        }
        
        // 하나의 배열로
        int[] answer = new int[size];
        int idx = 0;
        for(int r=0; r<n; r++){
            for(int c=0; c<=r; c++){
                answer[idx++] = arr[r][c];
            }
        }
        
        return answer;
    }
}