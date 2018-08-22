package design_pattern.singleton;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午2:29 22/8/18
 * @ModifiedBy:
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;


    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }


}
