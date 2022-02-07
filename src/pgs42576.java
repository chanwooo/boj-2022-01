/*
    ["leo", "kiki", "eden"], ["eden", "kiki"]
    -> "leo"
 */
import java.util.Arrays;

public class pgs42576 {
    public static void main(String[] args) {
        var Sol = new Solution();
        var result = Sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(result);
    }
}


class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(var i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];


    }
}
