public class Counter {
    private int count = 0;

    // synchronized --> use to tell that when many threads try to use this function then it will be used by the one only at a time...
    // By this we are locking this function so it will be used by one thread only then another... (Intrinsic Lock)

    public synchronized void  increment(){
        count++;
    }

    public int getCounter() {
        return count;
    }

    public void setCounter(int count) {
        this.count = count;
    }
}
