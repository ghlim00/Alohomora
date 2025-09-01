import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        // map에 코드와 번호 매핑
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        // map에서 기준점 가져오기
        int extIndex = map.get(ext);
        int sortIndex = map.get(sort_by);
        
        // 리스트를 생성한 후,
        // 기준점 통과만 리스트에 추가
        List<int[]> list = new ArrayList<>();
        
        for(int[] da : data){
            if(da[extIndex] < val_ext)
                list.add(da);
        }
        
        // !! 리스트를 정렬하는 방법 알아두기 (얘는 오름차순)
        list.sort(Comparator.comparingInt(a -> a[sortIndex]));
        
        // [][] 형식이지만 answer[i] 로 바로 한 행 씩 받
        int[][] answer = new int[list.size()][];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}