class Solution {
    public int solution(int[][] triangle) {
        
        // triangle에 그대로 누적 합 적용
        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                // 맨 왼쪽의 경우
                if(j==0){
                    triangle[i][j] += triangle[i-1][j];
                }
                // 맨 오른쪽
                else if(j==triangle[i].length-1){
                    triangle[i][j] += triangle[i-1][j-1];
                }
                // 가운데
                else{
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }
            }
        }
        
        // 마지막 행에서 찾기
        int answer = 0;
        for(int num : triangle[triangle.length-1]){
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
}