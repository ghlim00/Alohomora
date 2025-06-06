class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        char ch1 = sb.charAt(num1);
        char ch2 = sb.charAt(num2);
        
        // setCharAt()
        sb.setCharAt(num1, ch2);
        sb.setCharAt(num2, ch1);
        
        return sb.toString();
    }
}



// // 1번
// class Solution {
//     public String solution(String my_string, int num1, int num2) {
//         char[] arr = my_string.toCharArray();
        
//         char temp = arr[num1];
//         arr[num1] = arr[num2];
//         arr[num2] = temp;
        
//         return new String(arr); // arr.toString() 아님 주의
//     }
// }