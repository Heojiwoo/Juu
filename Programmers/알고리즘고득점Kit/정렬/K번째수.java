package Programmers.알고리즘고득점Kit.정렬;

/*
* 1. i ~ j 까지 배열 자르기
* 2. 오름차순 정렬
* 3. k번째 수 구하기
* 4. 배열에 담에서 리턴
 */

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    // 결과를 담을 배열
        int n = 0;  // 'answer' 배열의 인덱스

        for (int i = 0; i < commands.length; i++) {
            // ↓ i ~ j 까지 자른 결과를 담을 배열
            int[] list = new int[commands[i][1] - commands[i][0] + 1];
                                // ↑ 끝 인덱스 = j  ↑ 시작 인덱스 = i
                                // 배열의 인덱스는 0부터 시작하기 때문에 구한 길이에 1을 더해주어야 실제 배열의 길이가 됨

            int k = 0;  // 'list' 배열의 인덱스

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                // list 배열에 넣기
                list[k++] = array[j - 1];
                                // ↑ 배열의 인덱스를 0부터 시작하도록 하기 위해 사용
                // k++를 통해 다음에 저장할 값이 list 배열의 다음 인덱스에 저장되도록 함
                // ex) k[0] → k[1] → k[2]
            }
            Arrays.sort(list);  // 오름차순 정렬
            answer[n++] = list[commands[i][2] - 1];     // K번째 수 구하기
                                // ↑ commands 배열의 k 를 의미
            // k++를 통해 다음에 저장할 값이 list 배열의 다음 인덱스에 저장되도록 함
            // ex) n[0] → n[1] → n[2]
        }
        return answer;
    }

}
