import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // Arrays.asList() 로 set에 넣기
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        // 모든 번호에 대해
        for(String number : phone_book){
            // 잘라보기 (ex. 1235라면 1, 12, 123까지)
            for(int i =1; i<number.length() ; i++){
                String prefix = number.substring(0, i);
                // (잘라낸) 접두어가 set에 있는지 확인
                if(set.contains(prefix))
                    return false;
            }
        }
        
        return true;
    }
}