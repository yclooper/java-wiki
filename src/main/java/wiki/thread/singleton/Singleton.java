package wiki.thread.singleton;

/**
 * 双重校验所单例
 * Created by chen on 2020/8/6.
 */
public class Singleton {

    private static volatile Singleton singleton=null;

    private Singleton() {

    }
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}