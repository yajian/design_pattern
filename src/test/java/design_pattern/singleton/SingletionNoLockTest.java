package design_pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午4:47 18/7/18
 * @ModifiedBy:
 */
public class SingletionNoLockTest {

    @Test
    public void test() {
        SingletonNoLock singleton2 = SingletonNoLock.getInstance();
        SingletonNoLock singletonNoLock = SingletonNoLock.getInstance();
        Assert.assertTrue(singleton2 == singletonNoLock);
    }
}
