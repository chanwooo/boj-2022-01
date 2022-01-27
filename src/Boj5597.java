import java.util.Arrays;
import java.util.Scanner;

public class Boj5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] attendance = new boolean[30];

        //System.out.println(Arrays.toString(attendance));

        for (var i = 0; i < 28; i++) {
            var num = Integer.parseInt(scanner.nextLine());
            attendance[num - 1] = true;
        }

        for (var i = 0; i < 30; i++) {
            if (attendance[i] == false) {
                System.out.println(i+1);
            }
        }


    }
}
