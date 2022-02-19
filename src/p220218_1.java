import java.util.Arrays;
import java.util.Scanner;

/*
boj16433 주디와 당근농장
 */
public class p220218_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var N = sc.nextInt();
        var R = sc.nextInt();
        var C = sc.nextInt();
        var field = new char[N][N];
        plantCarrot(field, R, C);
        fieldPrint(field);
    }

    /*
    aba  0 1 2
    bab  1 2 3
    aba  2 3 4

    ab 0 1
    ba 1 2

    */
    static void fieldPrint(char[][] field) {
        for (var row : field) {
            for (var col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void plantCarrot(char[][] field, int R, int C) {
        var item = new char[]{'.', 'v'};
        for (var row = 0; row < field.length; row++) {
            for (var col = 0; col < field[row].length; col++) {
                if((R+C)%2==1){
                    field[row][col]=item[(row+col)%2];
                }
                else{
                    field[row][col]=item[(row+col+1)%2];
                }
            }

        }
    }

}
