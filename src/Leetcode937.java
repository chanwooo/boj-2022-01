import java.util.Arrays;

public class Leetcode937 {
    public static void main(String[] args) {
        var sol = new Solution();
        var logs = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.println(Arrays.toString(sol.reorderLogFiles(logs)));
    }
    static class Solution {
        public String[] reorderLogFiles(String[] logs) {
            var letterLog = new String[logs.length];
            var digitLog = new String[logs.length];
            for(var log : logs){

                if(Character.isDigit(log.split(" ")[1].charAt(0))){
                    System.out.println("digit " + log);


                } else {
                    System.out.println("letter " + log);
                }
            }
            var str1 = new String[]{"aa","bb"};
            swap(str1);
            System.out.println(Arrays.toString(str1));


            return logs;
        }
        void swap(String[] str1){
            var temp=str1[0];
            str1[0] = str1[1];
            str1[1] = temp;
        }
    }
}
