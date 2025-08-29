import java.util.*;

class Solution {
    
    // 표 그대로 저장
    private static int[][] fatigue = {
        {1,1,1},
        {5,1,1},
        {25,5,1}
    };
    
    // Block 객체 생성
    static class Block{
        // 광물 카운팅
        int diaCount = 0;
        int ironCount = 0;
        int stoneCount = 0;
        
        // Block 생성
        public Block(){
            this.diaCount = 0;
            this.ironCount = 0;
            this.stoneCount = 0;
        }
        
        // 피로도 계산
        public int getFatigue(int pickType){
            int total = 0;
            total += diaCount * fatigue[pickType][0];
            total += ironCount * fatigue[pickType][1];
            total += stoneCount * fatigue[pickType][2];
            return total;
        }
    }
    
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int howManyPicks = picks[0] + picks[1] + picks[2];
        int maxMine = Math.min(minerals.length, howManyPicks * 5);
        
        List<Block> block = new ArrayList<>();  // 5개당 블럭 하나
        
        // 이 for문에서는 Block 덩어리를 생성하고, 카운팅만
        for(int i=0; i<maxMine; i++){
            if(i%5 == 0)
                block.add(new Block());
            
            Block curr = block.get(block.size() - 1); // 지금 블럭을 불러온다
            
            // 현재 미네랄을 pick해서 카운팅
            String mineral = minerals[i];
            
            if(mineral.equals("diamond")){
                curr.diaCount++;
            } 
            else if(mineral.equals("iron")){
                curr.ironCount++;
            } 
            else if(mineral.equals("stone")){
                curr.stoneCount++;
            } 
            
        }
        
        // 돌 곡괭이 기준 피로도 내림차순
        // 람다는 오버 플로우 등의 위험 소지 있음
        // Collections.sort(block, (b1, b2) -> {
        //     return b2.getFatigue(2) - b1.getFatigue(2);
        // });
        
        Collections.sort(block, (b1, b2) ->
            Integer.compare(b2.getFatigue(2), b1.getFatigue(2))
        );

        // 최종 피로도 계산 (다이아 -> 철 -> 돌 곡괭이 순으로 사용)
        for(Block b : block){  // block이라는 이름의 List안의 모든 Block 덩어리에 대하여 실시
            
            // 만약 곡괭이가 하나도 남지 않았으면 작업을 중단해야 해요.
            if (picks[0] == 0 && picks[1] == 0 && picks[2] == 0) {
                break; // 더 이상 캘 곡괭이가 없으면 루프 종료
            }
            
            if(picks[0] > 0){
                answer += b.getFatigue(0);
                picks[0]--;
            }
            else if(picks[1] > 0){
                answer += b.getFatigue(1);
                picks[1]--;
            }
            else{
                answer += b.getFatigue(2);
                picks[2]--;
            }
        }
        
        return answer;
    }
}