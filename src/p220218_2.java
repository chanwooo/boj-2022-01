import java.util.Scanner;

/*
boj12605 단어순서 뒤집기
 */
public class p220218_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = Integer.parseInt(sc.nextLine());
        var inputData = new String[N];
        for (var i = 0; i < N; i++) {
            inputData[i] = sc.nextLine();
        }

        for (var i = 0; i < N; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            System.out.println(reverseText(inputData[i]));
        }

    }

    static String reverseText(String inputText) {
        var splitText = inputText.split(" ");
        var reverseText = new StringBuilder();
        for (var i = 0; i < splitText.length; i++) {
            reverseText.append(splitText[splitText.length - i - 1]).append(" ");
        }

        return reverseText.substring(0, reverseText.length() - 1);
    }
}
