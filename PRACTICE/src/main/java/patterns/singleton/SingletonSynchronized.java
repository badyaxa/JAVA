package patterns.singleton;

public class SingletonSynchronized extends AbstractSingleton {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}