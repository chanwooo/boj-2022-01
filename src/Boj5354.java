import java.util.Arrays;
import java.util.Scanner;

public class Boj5354 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var numCase = sc.nextInt();
        int[] size = new int[numCase];

        for (var i = 0; i < numCase; i++) {
            size[i] = sc.nextInt();
        }

        for (var tc = 0; tc < numCase; tc++) {
            for (var i = 0; i < size[tc]; i++) {
                for (var j = 0; j < size[tc]; j++) {
                    if (i == 0 || j == 0 || i == size[tc] - 1 || j == size[tc] - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
