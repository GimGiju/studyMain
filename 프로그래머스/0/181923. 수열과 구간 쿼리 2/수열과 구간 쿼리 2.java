class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       for (int[] query : queries) {       // 쿼리스 배열의 각 요소인 쿼리를 하나씩 순회
            int s = query[0];               // 쿼리는 2개의 정수를 담고 있는 배열로 첫번째 정수는 시작 인덱스 s
            int e = query[1];
            int k = query[2];
            for (int i = s; i <= e; i++) {      // 조건문으로 i를 s라고 선언하고 i는 e 보다 작거나 같으면서 i가 순회하면서
                arr[i] += 1;        // arr를 1씩 증가 시킴  arr[i] = arr[i] + 1과 동일함
            }
        }
        return arr;
    }
}