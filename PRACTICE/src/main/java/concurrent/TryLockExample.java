package concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void method() {
        try {
            if (lock1.tryLock() && lock2.tryLock()) {
                try {
                    // критична секція
                } finally {
                    lock2.unlock();
                    lock1.unlock();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
