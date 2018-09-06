package cls.practice;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapFun {

    public static void main(String[] args) {
        HashMapFun obj = new HashMapFun();
        HashMap<String,String> map = createMap();
        showMap(map);
    }

    public static HashMap<String,String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0; i<10; i++) map.put("key"+i, "val"+i);
        return map;
    }

    public static void showMap(HashMap<String,String> map){
        for(String key:map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

}
