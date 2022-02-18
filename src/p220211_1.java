import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
프로그래머스 위장
 */
public class p220211_1 {
    public static void main(String[] args) {
        var Sol = new Solution1();
        System.out.println(
                Sol.solution(new String[][]
                {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}
                )
        );
    }
}

class Solution1 {
    public int solution(String[][] clothes) {
        // type : [name1, name2, name3]
        var closet = new DefaultDict<String, List<String>>(ArrayList.class);
        var itemCount = clothes.length;
        var answer = 1;

        for (var item : clothes) {
            closet.get(item[1]).add(item[0]);
        }
        System.out.println(closet);

        for(var item : closet.entrySet()){
            answer *= item.getValue().size()+1;
            System.out.println(item.getValue());
        }

        return answer-1;
    }
}

class DefaultDict<K, V> extends HashMap<K, V> {

    Class<V> klass;
    public DefaultDict(Class klass) {
        this.klass = klass;
    }

    @Override
    public V get(Object key) {
        V returnValue = super.get(key);
        if (returnValue == null) {
            try {
                returnValue = klass.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            this.put((K) key, returnValue);
        }
        return returnValue;
    }
}
