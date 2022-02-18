import java.util.Arrays;
import java.util.Scanner;

/*
인프런 큰 수 출력하기
 */
public class p220211_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        var inputData = new int[N];
        for(var i=0;i< N; i++){
            inputData[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(inputData));

        System.out.print(inputData[0]);
        for(var i=1; i<N; i++){
            if(inputData[i-1]<inputData[i])
            {
                System.out.print(" "+inputData[i]);
            }
        }
        System.out.println();
    }
}
