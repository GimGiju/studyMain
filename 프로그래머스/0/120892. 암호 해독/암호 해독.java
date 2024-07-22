class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
         for(int n = code - 1; n < cipher.length(); n+=code){
            answer += cipher.charAt(n);
        }
         
        return answer;
    }
}