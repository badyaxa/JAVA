package concurrent;

public class SingleLock {
    private final Object lock = new Object();

    public void method() {
        synchronized (lock) {
            // критична секція
        }
    }
}
