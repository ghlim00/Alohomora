class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String vowels = "aeiou";
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            
            // 단어.indexOf(캐릭터) -> 인덱스가 있으면 인덱스 번호, 없으면 -1 반환
            if(vowels.indexOf(ch) == -1){
                answer.append(ch);
            }
        }
        
        return answer.toString();
    }
}