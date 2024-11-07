package concurrent;

public class LockOrdering {

    public void orderedLock(Object lockA, Object lockB) {
        Object firstLock = lockA.hashCode() < lockB.hashCode() ? lockA : lockB;
        Object secondLock = lockA.hashCode() >= lockB.hashCode() ? lockA : lockB;

        synchronized (firstLock) {
            synchronized (secondLock) {
                // критична секція
            }
        }
    }


}
