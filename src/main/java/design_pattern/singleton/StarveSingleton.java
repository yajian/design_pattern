package design_pattern.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 上午11:00 20/7/18
 * @ModifiedBy:
 */
public class StarveSingleton implements Serializable {

    private static volatile boolean flag = false;

    private static StarveSingleton instance = new StarveSingleton();

    private StarveSingleton() {
        synchronized (StarveSingleton.class) {
            if (!flag) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式被破坏");
            }
        }
    }

    public static StarveSingleton getInstance() {
        return instance;
    }


    public Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println(StarveSingleton.getInstance() == StarveSingleton.getInstance());
        Class<StarveSingleton> clazz = StarveSingleton.class;
        Constructor<StarveSingleton> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        StarveSingleton instance = constructor.newInstance();
        System.out.println(instance == StarveSingleton.getInstance());

    }
}
