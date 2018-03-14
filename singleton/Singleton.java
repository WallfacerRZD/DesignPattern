package singleton;

/**
 * synchronized实现线程安全
 *
 * @author
 * @date
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

/**
 * 在加载类时创建单件, 保证线程安全
 */
class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 uniqueInstance = new Singleton2();

    public Singleton2 getUniqueInstance() {
        return uniqueInstance;
    }
}

/**
 * 使用双重检查加锁, 减少使用同步
 */
class Singleton3 {
    private static volatile Singleton3 uniqueInstance;

    private Singleton3() {

    }

    public static Singleton3 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
