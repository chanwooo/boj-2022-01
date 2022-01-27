import java.util.Scanner;

public class Boj17388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine().split(" ");
        int S = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int H = Integer.parseInt(input[2]);
        int min = Math.min(S,Math.min(K,H));

        if(S+K+H >= 100) {
            System.out.println("OK");
        } else {
            if(min == S){
                System.out.println("Soongsil");
            } else if(min == K){
                System.out.println("Korea");
            }
            else {
                System.out.println("Hanyang");
            }
        }
    }
}
