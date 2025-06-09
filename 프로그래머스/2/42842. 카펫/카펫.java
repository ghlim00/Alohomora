class Solution {
    public int[] solution(int brown, int yellow) {
        
        // 전체 카펫 크기
        int total = brown + yellow;
        
        // 노란색이 존재하려면 최소 높이 3
        // w*h 조합 중 색상 별 크기가 동일한 경우 return
        for(int h=3; h<=total/h; h++){
            if(total % h == 0){
                int w = total/h;
                if((w-2)*(h-2) == yellow){
                    return new int[]{w,h};
                }
            }
        }
        
        return new int[]{};
    }
}