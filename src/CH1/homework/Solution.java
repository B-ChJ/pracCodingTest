package CH1.homework;

import java.util.ArrayList;
import java.util.List;
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
    String[] tester1 = {"도", "레", "미", "파"};
    String[] tester2 = {"레", "레", "파", "파", "도", "도"};
    String[] tester3 = {"미", "파", "미", "도", "레", "도"};

    public int[] solution(String[] answers) {

        List<String[]> testers = new ArrayList<String[]>();
        testers.add(tester1);
        testers.add(tester2);
        testers.add(tester3);
        int[] score = new int[testers.size()]; //각 응시자의 점수 배열
        ArrayList<Integer> pass = new ArrayList<>();
        for (int i = 0; i < testers.size(); i++) {
            for (int j = 0; j < answers.length; j++) {
                if(testers.get(i)[j%testers.get(i).length].equals(answers[j]))
                {score[i]++;}
            }
        }
        int best = Math.max(Math.max(score[0], score[1]), score[2]); // 최고점수 best
        for(int s = 1; s < score.length; s++) { //최고점을 가진 응시자 번호 추출
            if(score[s-1]==best){ pass.add(s); }
        }

        int[] answer = new int[pass.size()];
        for (int i = 0; i < pass.size(); i++) {
            if(pass.get(i)==0){ continue; }
            else answer[i] = pass.get(i);
        }
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

        // 결과 출력
        int[] result = solution.solution(answers);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
