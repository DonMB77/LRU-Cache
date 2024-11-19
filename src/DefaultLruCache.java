import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer>
        implements LruCache {

    private int capacity;

    public DefaultLruCache(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }

    public DefaultLruCache() {
        super(16, 0.75f, true);
    }

    @Override
    public int get(int key) {
        if (super.get(key) == null) {
            return -1;
        } else {
            return super.get(key);
        }
    }

    @Override
    public boolean removeEldestEntry (Map.Entry eldest) {
        return size() > capacity;
    }

    @Override
    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
