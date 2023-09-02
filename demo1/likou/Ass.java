package demo1.likou;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(001, "Java");
        map.put(002, "数据库");
        map.put(003, "Vue");
        System.out.println(map);

        // 通过Map.keySet使用iterator遍历key,然后通过key得到对应的value值
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
