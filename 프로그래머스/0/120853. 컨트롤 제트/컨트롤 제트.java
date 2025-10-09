class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        
        int len = arr.length;
        
        for(int i=0; i<len; i++){
            if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i-1]);
            }
            else{
                answer += Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}