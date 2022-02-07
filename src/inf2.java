/*
    인프런 2번 아나그램
    AbaAeCe
    baeeACA
    YES
 */
import java.util.Arrays;
import java.util.Scanner;

public class inf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var input1 = sc.nextLine().toCharArray();
        var input2 = sc.nextLine().toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);

        System.out.println(Arrays.equals(input1, input2)?"YES":"NO");
    }
}
