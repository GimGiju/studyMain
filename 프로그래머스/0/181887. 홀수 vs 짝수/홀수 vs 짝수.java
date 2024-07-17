class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer1 = 0;
        for (int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){
                answer += num_list[i];
            }else {
                answer1 += num_list[i];
            }

        }
       
        return (answer1 < answer) ? answer : answer1;
    }
}