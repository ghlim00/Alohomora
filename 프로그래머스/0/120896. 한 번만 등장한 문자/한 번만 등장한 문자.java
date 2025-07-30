import java.util.*;

class Solution {
    public String solution(String s) {
        
        // s에 있는 알파벳 각 몇회 등장하는지 맵에 저장
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // 하나짜리를 list에 넣을거임
        List<Character> list = new ArrayList<>();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        
        // sorting
        Collections.sort(list);
        
        // string으로 바꾸기
        StringBuilder sb = new StringBuilder();
        
        // 이건 안됨
        // for(int i=0; i<list.size(); i++){
        //     sb.append(list[i]);
        // }
        for(char ch : list){
            sb.append(ch);
        }
        
        
        return sb.toString();
        
    }
}