package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(
                    "time "+ Thread.currentThread().getName()+" "
                    +System.currentTimeMillis()
            );
        }
        finally {
            lock.readLock().unlock();

        }
    }
}
