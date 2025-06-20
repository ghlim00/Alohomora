class Solution {
    public int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes){
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            maxWidth = Math.max(w, maxWidth);
            maxHeight = Math.max(h, maxHeight);
        }
        
        int answer = maxWidth * maxHeight;
        
        return answer;
    }
}