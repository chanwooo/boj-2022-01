import java.util.Arrays;
import java.util.Scanner;

public class Boj2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var N = sc.nextInt();
        var M = sc.nextInt();
        int[] deck = new int[N];
        for (var i = 0; i < N; i++) {
            deck[i] = sc.nextInt();
        }

        var maxScore = 0;
        var score = 0;

        for (var i = 0; i < N - 2; i++) {
            for (var j = i + 1; j < N - 1; j++) {
                for (var k = j + 1; k < N; k++) {
                    score = deck[i] + deck[j] + deck[k];
                    if (score <= M) {
                        maxScore = Math.max(score, maxScore);
                    }
                }
            }
        }
        System.out.println(maxScore);
//        System.out.println(Arrays.toString(deck));
    }
}
