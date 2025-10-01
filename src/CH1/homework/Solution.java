package CH1.homework;

import java.util.Scanner;

/**음악 테스트 응시자의 패턴
 * 시험 문제의 정답이순서대로 들어있는 배열 answer가 주어졌을 때,
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return하는 함수를 작성하기

 * 응시자 3명
 * (1) 1번 응시자의 패턴: [도, 레, 미, 파]
      * 4개의 음계를 순차적으로 반복
      * ex) 도,레,미,파,도,레,미,파,도,레,...

 * (2) 2번 응시자의 패턴: [레, 레, 파, 파, 도, 도]
      * 6개의 음계를 순차적으로 반복
      * ex) 레,레,파,파,도,도,레,레,파,파,...

 * (3) 3번 응시자의 패턴: [미, 파, 미, 도, 레, 도]
      * 6개의 음계를 순차적으로 반복
      * ex) 미,파,미,도,레,도,미,파,미,도,...
 * 입력
 * 배열 answer (ex. 도, 레, 미, 파, ... )
   answer의 크기 N (0 ≤ N ≤ 5000)
   answer의 값은 도, 레, 미, 파 중 하나

 * 출력
 * 가장 많은 문제를 맞힌 사람*/
public class Solution {
    public int[] solution(String[] answers) {

        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        // 문제 개수 입력
        int N = sc.nextInt();

        // 정답 배열 입력
        String[] answers = new String[N];
        for (int i = 0; i < N; i++) {
            answers[i] = sc.next();
        }
        for(int j = 0; j < N; j++) {
        System.out.println(answers[j]);}
        // 결과 출력
//        int[] result = solution.solution(answers);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < result.length; i++) {
//            sb.append(result[i]);
//            if (i < result.length - 1) {
//                sb.append(" ");
//            }
//        }
//        System.out.println(sb.toString());
    }
}
