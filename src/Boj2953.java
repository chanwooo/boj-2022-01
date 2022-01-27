import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
5 4 4 5
5 4 4 4
5 5 4 4
5 5 5 4
4 4 4 5
 */
public class Boj2953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> score = new HashMap<>();
        var maxScore = 0;
        for (var i = 0; i < 5; i++) {
            var sumScore = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
            score.put(i + 1, sumScore);
            //maxScore = sumScore > maxScore ? sumScore : maxScore;
            maxScore = Math.max(sumScore, maxScore);
        }

        for (var key : score.keySet()) {
            var value = score.get(key);
            if (value == maxScore) {
                System.out.println(key+" "+value);
            }
        }

    }
}
