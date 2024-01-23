package Programmers.알고리즘고득점Kit.탐욕법Greedy;

import java.util.*;
public class 체육복 {

        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;

            Arrays.sort(lost);  // 오름차순 정렬
            Arrays.sort(reserve);

            // 여벌 체육복을 가져온 학생이 도난당한 경우
            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i] == reserve[j]){
                        answer++;
                        lost[i] = -1;       // 체육복을 도난 당했기 때문
                        reserve[j] = -1;    // 체육복을 빌려줄 수 없기 때문에
                        break;
                    }
                }
            }
            // 도난당한 학생에게 체육복 빌려주는 경우
            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                        // 도난당한 학생의 앞 번호나 뒷번호에 해당하는 학생이 여벌의 체육복을 가진 경우
                        answer++;
                        reserve[j] = -1;    // 체육복을 빌려줬기 때문
                        break;
                    }
                }
            }
            return answer;
        }
}
