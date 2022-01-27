
import java.util.Scanner;

public class boj1100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chessBoradInline = "";
        int result = 0;
        for(int i=0; i<8; i++)
        {
            chessBoradInline += scanner.nextLine();
            chessBoradInline += "!";
        }
        int i=0;
        for(String c : chessBoradInline.split("")){
            if(i%2==0){
                if(c.equals("F")){
                    result++;
                }
            }
            i++;
        }

        System.out.println(result);

    }
}
