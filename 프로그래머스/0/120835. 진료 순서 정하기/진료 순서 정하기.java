import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int n = emergency.length;
        int[] ranking = new int[n];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] rank = emergency.clone();  // .clone()으로 배열 복제
        Arrays.sort(rank);
        
        // 맵에 응급도-랭킹 저장
        for(int i=0; i<n; i++){
            map.put(rank[n-1-i], i+1);
        }
        
        // 응급도를 key값으로 랭킹 찾아오기
        for(int i =0; i<n; i++){
            ranking[i] = map.get(emergency[i]);
        }
        
        return ranking;
    }
}