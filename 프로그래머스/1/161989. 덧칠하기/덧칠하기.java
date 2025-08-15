class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        int painted = 0;  // 마지막(오른쪽 끝)으로 칠해진 칸의 번호
    
        // 새로 색칠해야 하는 경우 -> '해당 칸부터' 색칠하고 마지막 칸 업데이트
        for(int num : section){
            if(painted < num){
                painted = num + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}