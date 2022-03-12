import java.util.*;

public class Lc49 {
    public static void main(String[] args) {
        var sol = new Solution();
        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            var dict = new HashMap<String, List<String>>();
            for(var str: strs){
                var charArray = str.toCharArray();
                Arrays.sort(charArray);
                var key = String.valueOf(charArray);
//                if(dict.get(key)==null){
//                    dict.put(key, new ArrayList<>());
//                }
                dict.computeIfAbsent(key, k -> new ArrayList<>());
                dict.get(key).add(str);

            }
            return new ArrayList(dict.values());
        }
    }
}



