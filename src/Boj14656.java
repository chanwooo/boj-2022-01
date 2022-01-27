import java.util.Arrays;
import java.util.Scanner;

public class Boj14656 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var N = Integer.parseInt(scanner.nextLine());
        var lineup = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        var PPATTA = 0;

        for (var i = 0; i < N; i++) {
            if(lineup[i]!=i+1){
                PPATTA++;
            }
        }
        System.out.println(PPATTA);

    }
}
