package structural.flyweight;

import java.util.Map;
import java.util.HashMap;

public class FlyweightFactory {
    private static FlyweightFactory singleton = new FlyweightFactory();
    private Map<Integer, Flyweight> map = new HashMap<Integer, Flyweight>();

    private FlyweightFactory() {}

    public static FlyweightFactory getInstance() {
        return singleton;
    }

    public synchronized Flyweight getFlyweight(int id) {
        Flyweight flyweight = (Flyweight)map.get(id);
        if(flyweight == null) {
            flyweight = new Flyweight(id);
            map.put(id, flyweight);
        }
        return flyweight;
    }
}