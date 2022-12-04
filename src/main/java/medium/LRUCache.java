package medium;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lruCache.get(1)); // return 1
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lruCache.get(2)); // returns -1 (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lruCache.get(1)); // return -1 (not found)
        System.out.println(lruCache.get(3)); // return 3
        System.out.println(lruCache.get(4)); // return 4
    }

    private int capacity;
    private Map<Integer, Long> usedTimeMap;
    private Map<Integer, Integer> cacheMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        usedTimeMap = new HashMap<>();
        cacheMap = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (cacheMap.containsKey(key)) {
            usedTimeMap.replace(key, Calendar.getInstance().getTimeInMillis());
            return cacheMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cacheMap.size() == capacity) {
            usedTimeMap.entrySet().forEach(o -> System.out.println(o.getKey() + " ," + o.getValue()));
            Integer removeKey =
                    usedTimeMap.entrySet().stream().min((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey();
            cacheMap.remove(removeKey);
            System.out.println("removeKey " + removeKey);
            usedTimeMap.remove(removeKey);
        }
        cacheMap.put(key, value);
        usedTimeMap.put(key, Calendar.getInstance().getTimeInMillis());
    }
}
