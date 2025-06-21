import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostlist = new ArrayList<>();
        List<Integer> reservelist = new ArrayList<>();
        
        for(int l : lost) 
            lostlist.add(l);
        
        for(int r : reserve)
            reservelist.add(r);
        
        // 잃어버렸으면서 여벌이 있는 경우
        List<Integer> toRemove = new ArrayList<>();
        for(int l : lost){
            if(reservelist.contains(l)){
                toRemove.add(l);
            }
        }
        
        // 리스트에서 제거 : remove()
        for(int r : toRemove){
            lostlist.remove(Integer.valueOf(r));
            reservelist.remove(Integer.valueOf(r));
        }
        
        // 남은 reserve로 lost 도와주기
        for(int r : reservelist){
            if(lostlist.contains(r-1)){
                lostlist.remove(Integer.valueOf(r-1));
            }
            else if(lostlist.contains(r+1)){
                lostlist.remove(Integer.valueOf(r+1));
            }
        }
        
        return n-lostlist.size();
        
    }
}