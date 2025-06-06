class Solution {
    public String[] solution(String[] names) {
        
        int len = (names.length + 4)/5;
        String[] arr = new String[len];
        
        int index = 0;
        
        for(int i=0; i<names.length; i+=5){
            arr[index] = names[i];
            index++;
        }
        
        return arr;
    }
}