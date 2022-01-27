import java.util.Arrays;
import java.util.Scanner;

public class Boj20499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var kda = scanner.nextLine().split("/");
        var k = Integer.parseInt(kda[0]);
        var d = Integer.parseInt(kda[1]);
        var a = Integer.parseInt(kda[2]);

        if (k + a < d || d == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }

//        System.out.println(Arrays.toString(kda));

    }
}
