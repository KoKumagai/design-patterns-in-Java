package factory.prototype;

import java.util.Hashtable;

public class Cache {
    private static Hashtable<Integer, Prototype> map  = new Hashtable<Integer, Prototype>();

    public static Prototype getPrototype(int id) {
        Prototype cachedPrototype = map.get(id);
        return (Prototype)cachedPrototype.createClone();
    }

    public static void loadCache() {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setId(1);
        map.put(prototype1.getId(), prototype1);

        ConcretePrototype2 prototype2 = new ConcretePrototype2();
        prototype2.setId(2);
        map.put(prototype2.getId(), prototype2);
    }
}