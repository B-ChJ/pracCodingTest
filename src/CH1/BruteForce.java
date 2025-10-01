package CH1;

import java.util.Scanner;

/**철수는 물건을 구매하고 거스름돈을 받아야 합니다.
 * 가게에는 500원, 100원, 50원, 10원짜리 동전이 무한히 있다고 가정할 때,
 * 특정 금액을 거슬러주기 위한 최소한의 동전 개수를 구하는 프로그램을 작성해보세요.

 입력
 첫째 줄에 거슬러 주어야 할 금액 N이 주어집니다. (0 ≤ N ≤ 10,000)
 사용할 수 있는 동전의 종류: 500원, 100원, 50원, 10원

 출력
 거스름돈 N원을 만들기 위한 최소 동전 개수를 출력합니다.

 * element : 거스름돈 N원, 최소 동전 개수 coins개
 * Array : 동전의 종류별 가질 수 있는 최다 동전 개수[], 동전 종류 [500, 100, 50, 10] */
public class BruteForce {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("거슬러 줘야 하는 금액을 입력하세요.(0 ≤ N ≤ 10,000)");
        int[] coins = new int[]{500, 100, 50, 10};
        int num = input.nextInt();
        int minCoins = num;
        int[] maxCoins =  new int[coins.length];
        for(int i = 0; i < coins.length; i++){
            maxCoins[i] = num/coins[i];
        }

        //500*i + 100*j + 50*k + 10*l = N
        for(int i = 0; i <= maxCoins[0]; i++){
            for(int j = 0; j <= maxCoins[1]; j++){
                for(int k = 0; k <= maxCoins[2]; k++){
                    for(int l = 0; l <= maxCoins[3]; l++){
                        int sum = coins[0]*i + coins[1]*j + coins[2]*k + coins[3]*l;

                        if(sum == num) {
                            minCoins = Math.min(minCoins, i+j+k+l);
                        }
                    }
                }
            }
        }
        System.out.println("최소 동전 갯수: " + minCoins);
    }
}
