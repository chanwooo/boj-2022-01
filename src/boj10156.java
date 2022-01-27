import java.util.Arrays;
import java.util.Scanner;

public class boj10156 {

    public static void main(String[] args) {
	//300 4 1000 -> 200
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] inputNumbers = Arrays.stream(inputString.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int price = inputNumbers[0] * inputNumbers[1];
        int balance = inputNumbers[2];

        int loanBalance = price - balance > 0 ? price-balance : 0 ;

        System.out.println(loanBalance);
    }
}
