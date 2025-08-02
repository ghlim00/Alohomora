import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        /*
        알고리즘 프로세스
        
        1. <이름, 랭킹> , <랭킹, 이름> -> 2가지 맵 생성
        2. 각각의 맵을 매번 바꿔줌
        3. 정답 배열 생성 후 반환
        */
        
        HashMap<String, Integer> name_rank = new HashMap<>();
        HashMap<Integer, String> rank_name = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            name_rank.put(players[i], i);
            rank_name.put(i, players[i]);
        }
        
        
        for(String call : callings){
            
            String currentPlayer = call;
            int currentRank = name_rank.get(call);
            int aheadRank = currentRank - 1;
            String aheadPlayer = rank_name.get(aheadRank);
            
            
            name_rank.put(currentPlayer, aheadRank);
            name_rank.put(aheadPlayer, currentRank);
            rank_name.put(currentRank, aheadPlayer);
            rank_name.put(aheadRank, currentPlayer);
        }
        
        
        String[] answer = new String[players.length];
        
        for(int i=0; i<players.length; i++){
            answer[i] = rank_name.get(i);
        }
        
        return answer;
        
        
    }
}