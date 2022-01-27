import java.util.Arrays;
import java.util.Scanner;

// one hand, no look, phone
/*
3 6 9
2
0 0 0
0 1 0
3 3 3
1 2 3
1 1 1
2 2 2

 */
public class Boj23348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var skill_score = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
//        System.out.println(Arrays.toString(skill_score));
        var numberTeams = Integer.parseInt(scanner.nextLine());
        var maxScore = 0;
        var currScore = 0;

        for (var i = 0; i < numberTeams; i++) {


            for (var j = 0; j < 3; j++) {
                var useSkill = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                currScore += useSkill[0]*skill_score[0] + useSkill[1]*skill_score[1] + useSkill[2] * skill_score[2];
            }
            maxScore = currScore > maxScore ? currScore : maxScore;
            currScore = 0;

        }

        System.out.println(maxScore);


    }
}
