package design_pattern.singleton;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 上午11:10 20/7/18
 * @ModifiedBy:
 */
public class LazySingleton {


    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
