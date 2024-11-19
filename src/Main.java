import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        DefaultLruCache cache1 = new DefaultLruCache( 2);
        cache1.put(1, 1);
        cache1.put(2, 2);
        System.out.println(cache1.get(1));
        cache1.put(3, 3);
        System.out.println(cache1.get(2));
        cache1.put(4, 4);
        System.out.println(cache1.get(1));
        System.out.println(cache1.get(3));
        System.out.println(cache1.get(4));
    }
}