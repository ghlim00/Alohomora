class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        
        int pcount = 0;
        int ycount = 0;

        s = s.toLowerCase();
        
        for(char c : s.toCharArray()){
            if(c=='p') pcount++;
            if(c=='y') ycount++;
        }
        
        return (pcount == ycount) ? answer : !answer;

    }
}