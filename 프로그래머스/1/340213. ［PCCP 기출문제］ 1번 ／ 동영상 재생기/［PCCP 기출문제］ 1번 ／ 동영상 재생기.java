import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int opS = toInteger(op_start);
        int opE = toInteger(op_end);
        int now = toInteger(pos);
        int len = toInteger(video_len);
        
        now = skipOpening(now, opS, opE); // opS, opE를 같이 넘겨주어야 public으로 변수 선언 안해도 사용 가능
        
        for(String cmd : commands){
            if(cmd.equals("prev")){
                now = Math.max(0, now-10);        
            }
            else if(cmd.equals("next")){
                now = Math.min(len, now+10);
            }
            now = skipOpening(now, opS, opE);
        }
        
        return toString(now);
        
    }
    
    // 초 단위로 변환
    private int toInteger(String mmss){
        String[] arr = mmss.split(":");
        int mm = Integer.parseInt(arr[0]);
        int ss = Integer.parseInt(arr[1]);
        return mm*60 + ss;
    }
    
    // 00:00 타입으로 변환
    private String toString(int ss){
        int m = ss/60;
        int s = ss%60;
        
        // !! 02는 2자리로 표현하되, 빈자리는 0으로 - 라는 뜻
        return String.format("%02d:%02d", m, s);
    }
    
    // 자동 오프닝 스킵
    private int skipOpening(int time, int opS, int opE){
        if(time>=opS && time<=opE){
            return opE;
        }
        return time; // return 빼먹으면 안됨
    }
}