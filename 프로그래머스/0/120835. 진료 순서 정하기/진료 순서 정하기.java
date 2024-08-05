class Solution {
    public int[] solution(int[] emergency) {
         int a = emergency.length;
        int[] b = new int[a];
        for (int i = 0; i < a; i++){
            int c = 0;
            for (int j = 0; j < a; j++){
                if (emergency[i] < emergency[j]){
                    c++;
                }
            }
            b[i] = c + 1;
        }
        return b;
    }
}