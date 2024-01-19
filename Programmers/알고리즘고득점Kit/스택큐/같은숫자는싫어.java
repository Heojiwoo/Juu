package Programmers.알고리즘고득점Kit.스택큐;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {

        int[] answer;

        Stack<Integer> stack = new Stack<>();

        // 스택 초기화
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (i == 0) {
                stack.push(arr[i]);
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
