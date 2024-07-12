class Solution {
   public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){  // i가 배열 길이(my Strings) 0 ~ 3까지 증가하면서 돌때
            String str = my_strings[i];         // str은 my_strings와 같고

            answer += str.substring(parts[i][0], parts[i][1]+1); // answer에 str.substring(parts[i][0], parts[i][1]+1); 에서 나온 값을 계속 더해라 
            // parts[i][0], parts[i][1]+1 = substring(0, 5) 0번째 부터 5번째 전까지 문자를 출력하라는 뜻
        }
        return answer;
    }
}