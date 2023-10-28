package homework1026;

import java.util.Map;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<Integer,String>();
        map.put(1, "Amy");
        map.put(2, "Joe");
        map.put(3, "Tom");
        map.put(4, "Susan");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " -> " + value);
        }  //遍历哈希表
        map.put(5,"Mayuli");
        map.remove(4);
        map.put(3,"Tommy");

        System.out.println();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " -> " + value);
        }  //遍历哈希表
    }
}
