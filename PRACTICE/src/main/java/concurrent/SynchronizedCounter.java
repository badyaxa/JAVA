package concurrent;

class SynchronizedCounter {
    private int count = 0;

    public int getCount() {
        return count;
    }

//    public void increment() {
//        count = count + 1; // неатомарна операція
//    }

    public synchronized void increment() {
        count = count + 1;
    }
}
