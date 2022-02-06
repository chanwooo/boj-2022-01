/*
인프런 1번 학급회장
15
BACBACCACCBDEDE

C
 */

import java.util.*;

public class inf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var numMember = Integer.parseInt(sc.nextLine());
        var voteData = sc.nextLine();

        var voteResult = new HashMap<String, Integer>();
        var comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        for(var vote : voteData.split("")){
            voteResult.put(vote, voteResult.getOrDefault(vote,0)+1);
        }
        System.out.println(Collections.max(voteResult.entrySet(), comparator).getKey());
    }
}
