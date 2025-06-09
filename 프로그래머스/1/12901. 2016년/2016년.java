class Solution {
    public String solution(int a, int b) {
        
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totaldays = 0;
        
        for(int m = 0; m<a-1; m++){
            totaldays += month[m];
        }
        
        totaldays += (b-1);
        
        int index = totaldays % 7;
        
        return week[index];
    }
}