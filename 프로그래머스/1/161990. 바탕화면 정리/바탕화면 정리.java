class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                //if(wallpaper[i][j].equals("#"))
                /*
                wallpaper는 문자열 배열(String[]) 이고,
                wallpaper[i]는 문자열(String),
                wallpaper[i][j]는 문자(char) 입니다.

                즉 wallpaper[i][j]는 char인데, 여기에 .equals("#")를 쓰면 오류(또는 의도한 대로 동작 안 함)가 발생합니다.
                */
                if(wallpaper[i].charAt(j) == '#')
                {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }     
            }
        }
        
        return new int[]{lux, luy, rdx+1, rdy+1};      
    }
}