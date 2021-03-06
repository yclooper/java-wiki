package wiki.thread;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by chen on 2020/6/29.
 */
public class SynchronizedTest {
    public synchronized void one() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one执行了");
    }

    public synchronized void two() {
        System.out.println("two执行了");
    }

    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        SynchronizedTest test = new SynchronizedTest();
        Thread thread1=new Thread(test::one);
        Thread thread2=new Thread(test::two);
        thread1.start();
        thread2.start();
    }
}
