package examples.Greedy;

import java.util.Scanner;

/**철수는 물건을 구매하고 거스름돈을 받아야 합니다.
 * 가게에는 500원, 100원, 50원, 10원짜리 동전이 무한히 있다고 가정할 때,
 * 특정 금액을 거슬러주기 위한 최소한의 동전 개수를 구하는 프로그램을 작성해보세요.

 입력
 첫째 줄에 거슬러 주어야 할 금액 N이 주어집니다. (0 ≤ N ≤ 10,000)
 사용할 수 있는 동전의 종류: 500원, 100원, 50원, 10원

 출력
 거스름돈 N원을 만들기 위한 최소 동전 개수를 출력합니다.

 1. 가장 큰 동전부터 최대값을 구해 거스름돈을 계산한다.
  1) 500원부터 10원 순서로 배열 정렬 - int coins[]
  2) 각 동전이 가질 수 있는 최대 금액을 제하고 남은 금액 - int remain원
  3) 입력받을 거스름돈 int money원
 2. money원 내에서 각 동전이 가질 수 있는 최대 금액, 개수 계산
  1) 동전별 가질 수 있는 최대 금액, 갯수 계산
  2) 1)에서 진행한 최대 금액을 제한 나머지 금액에서 다음 동전의 최대 갯수 계산
  3) 1), 2)를 반복
 3. 사용된 동전의 개수 반환
  1) 사용된 동전의 개수 합 - countCoins*/
public class GreedyAlgorithm {
    public static int Solution(int money, int[] coins) {
        int remain = money;
        int countCoins = 0;

        for(int i = 0; i < coins.length; i++){
            countCoins = remain/coins[i];
            remain = remain%coins[i];
        }
        return countCoins;
    }
    public static void main(String[] args) {
       //elements 초기화
        int[] coins = new int[]{500, 100, 50, 10};
        int money = 0;
        Scanner input = new Scanner(System.in);

        money = input.nextInt();

        System.out.println(Solution(money, coins));
    }
}
