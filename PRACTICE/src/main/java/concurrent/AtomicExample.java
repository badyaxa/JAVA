package concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);
    private AtomicLong countLong = new AtomicLong(0);
    private AtomicBoolean flag = new AtomicBoolean(false);
    private AtomicReference<String> name = new AtomicReference<>("");

    public void increment() {
        count.incrementAndGet(); // атомарна операція інкременту
    }

    public int getCount() {
        return count.get();
    }


}
