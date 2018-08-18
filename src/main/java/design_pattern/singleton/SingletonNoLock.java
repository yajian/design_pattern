package design_pattern.singleton;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午2:39 19/7/18
 * @ModifiedBy:
 */
public class SingletonNoLock implements Serializable {

    private static AtomicReference<SingletonNoLock> instance = new AtomicReference<SingletonNoLock>();

    private SingletonNoLock() {

    }

    public static SingletonNoLock getInstance() {
        for (; ; ) {
            SingletonNoLock singletonNoLock = instance.get();
            if (singletonNoLock != null) {
                return singletonNoLock;
            }
            SingletonNoLock singleton = new SingletonNoLock();
            if (instance.compareAndSet(null, singleton)) {
                return instance.get();
            }
        }
    }

    private Object readResolve() {
        return instance.get();
    }

}


