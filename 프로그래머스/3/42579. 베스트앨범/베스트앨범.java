import java.util.*;

class Solution {
    
    // 1. Song 클래스 생성
    static class Song{
        int idx;
        int plays;
        
        Song(int idx, int plays){
            this.idx = idx;
            this.plays = plays;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        // 2. 장르별 재생횟수 / 장르별 인덱스 맵 2개 생성
        Map<String, Integer> total = new HashMap<>();
        Map<String, List<Song>> byGenre = new HashMap<>(); //Lis<Song> 주의
        
        // 3. genres 각 맵 채우기 (아직 정렬은 아님)
        for(int i=0; i<genres.length; i++){
            String g = genres[i];
            int p = plays[i];
            
            total.put(g, total.getOrDefault(g, 0) + p); //total.getOrDefault(g,0) 형식 주의
            
            if(!byGenre.containsKey(g)){
                byGenre.put(g, new ArrayList<>()); // g가 key인 곳에 넣어줌을 명시
            }
            byGenre.get(g).add(new Song(i, p)); //Song이니까 i,p 넣어주기
        }
        
        
        // 4. 각 맵 정렬하기
        // 4-1. 총 재생횟수 - 장르 내림차순 정렬
        List<String> genreOrder = new ArrayList<>(total.keySet()); // total.keySet()으로 key 넣어주기, "장르" 정렬하기
        genreOrder.sort((a,b) -> Integer.compare(total.get(b), total.get(a))); // 내림차순 정렬, Integer.compare 주의, b부터 주의
        
        
        // 4-2. 각 장르별 2개씩 뽑기
        List<Integer> pick = new ArrayList<>(); //노래 번호를 뽑음
        for(String g : genreOrder){ // 장르 정렬했으니, 그대로 돌면 됨
            List<Song> list = byGenre.get(g); // Song으로 이루어진 list를 만듦 -> 장르별 구분 맵에서 그대로 가져오면 됨
            
            list.sort((s1, s2) -> {
                if(s2.plays != s1.plays){ // 횟수 내림차순
                    return s2.plays - s1.plays; // 내림차순이라 s2 먼저
                }
                return s1.idx - s2.idx; // 오름차순이라 s1 먼저(기준도 다름)
            });
            pick.add(list.get(0).idx); // 1번째 많이 들은거
            if(list.size()>1){ // 2번째 많이 들은거
                pick.add(list.get(1).idx); //idx 빼먹지 않기
            }
        }
        
        // 5. 리스트 -> 배열 바꾸기
        int[] answer = new int[pick.size()];
        for(int i=0; i<pick.size(); i++){
            answer[i] = pick.get(i);
        }
        return answer;
        
    }
}