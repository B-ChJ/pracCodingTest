package CH1.homework;

import java.util.Scanner;

/**음악 테스트 응시자의 패턴
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
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("문제의 개수를 입력해 주세요.");
    }
}
