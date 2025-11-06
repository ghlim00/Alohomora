import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize==0) return 5 * cities.length;
        
        // linkedlist로 순서 유지
        // add/remove , First/Last
        LinkedList<String> cache = new LinkedList<>();
        
        for(String c : cities){
            
            String city = c.toLowerCase(); // newyork이랑 NewYork이 있음
            
            if(cache.remove(city)){
                answer += 1;
                cache.addLast(city);
            }
            else{
                answer += 5;
                if(cache.size() == cacheSize){
                    cache.removeFirst();   // 얘 때문에 캐시크기 0인 경우 따로 설정
                }
                cache.addLast(city);
            }
            
        }
        return answer;
    }
}