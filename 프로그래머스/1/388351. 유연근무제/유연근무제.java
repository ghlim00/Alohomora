import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int answer = 0;
        int people = schedules.length;
        
        for(int i=0; i<people; i++){
            int goal = schedules[i];
            
            int goalHour = goal/100;
            int goalMin = goal%100 + 10;
            if(goalMin >= 60){
                goalHour += 1;
                goalMin -= 60;
            }
            
            goal = goalHour*100 + goalMin;
            boolean pass = true; // pass 위치 주의
            
            for(int j=0; j<7; j++){
                int arrived = timelogs[i][j];
                int day = j + startday; // startday 빼먹지 않게 주의
                day = day%7;
                
                if(day == 6 || day==0)
                    continue;
                
                if(arrived > goal){
                    pass = false;
                    break;
                }
            }
            
            if(pass)
                answer++;
        }
        
        return answer;
    }
}