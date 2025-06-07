class Solution {
    public int solution(String s) {
        
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // {}안에 넣어야 함
        
        for(int i=0; i<numbers.length; i++){
            // s= 으로 다시 정의
            // replaceAll(바꿀 것, 무엇으로 바꿀지)
            s = s.replaceAll(numbers[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}