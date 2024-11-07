package concurrent;

public class OrderedLocks {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            synchronized (lock2) {
                // критична секція
            }
        }
    }

    public void method2() {
        synchronized (lock1) {
            synchronized (lock2) {
                // критична секція
            }
        }
    }
}
