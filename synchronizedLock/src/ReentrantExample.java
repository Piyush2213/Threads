import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();


    // Here what is happening I am using lock.lock() then it goes to print "Outer method" and count of lock is 1.
    // Then the innerMethod() called and again we see that it is asking lock.lock() which is already done...
    // This condition is deadlock, but java assign the lock as count of 2.
    // Then it will execute the "Inner method" and the lock.unlock() of inner and the count will be again goes to 1.
    // Then return back to outerMethod() finally block and do lock.unlock() and then the lock count will be 0;
    
    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
