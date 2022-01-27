import java.util.Scanner;

public class Boj5532 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var L = sc.nextInt();
        var A = sc.nextInt();
        var B = sc.nextInt();
        var C = sc.nextInt();
        var D = sc.nextInt();

        var dayA = (int)Math.ceil((double) A/C);
        var dayB = (int)Math.ceil((double) B/D);

        var playDay = L-Math.max(dayA,dayB);

        System.out.println(playDay);

    }
}
