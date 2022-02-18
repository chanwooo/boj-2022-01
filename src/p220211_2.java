import java.util.HashMap;
import java.util.Scanner;

/*
인프런 모든 아나그램 찾기
 */
public class p220211_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var S = sc.nextLine();
        var T = sc.nextLine();
        var answer = 0;

        var anagramDictT = new HashMap<String, Integer>();
        for (var c : T.split("")) {
            anagramDictT.put(c, anagramDictT.getOrDefault(c, 0) + 1);
        }
        //System.out.println(anagramDictT);


        var cursor = 0;
        while (S.length()-T.length() >= cursor) {
            var subStringS = S.substring(cursor,cursor+T.length());
//            System.out.println(subStringS);

            var anagramDictSSubString = new HashMap<String, Integer>();
            for (var c: subStringS.split("")){
                anagramDictSSubString.put(c, anagramDictSSubString.getOrDefault(c, 0)+1);
            }
//            System.out.println(anagramDictSSubString);

            if(anagramDictSSubString.equals(anagramDictT)){
//                System.out.println("+++find+++");
                answer+=1;
            }

            cursor+=1;
        }
        System.out.println(answer);


    }
}
