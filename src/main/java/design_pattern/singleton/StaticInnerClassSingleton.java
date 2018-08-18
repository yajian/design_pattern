package design_pattern.singleton;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午2:32 19/7/18
 * @ModifiedBy:
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton STATIC_SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.STATIC_SINGLETON;
    }

}
