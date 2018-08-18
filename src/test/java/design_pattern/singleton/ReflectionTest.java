package design_pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午4:24 19/7/18
 * @ModifiedBy:
 */
public class ReflectionTest {


    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = SingletonNoLock.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        SingletonNoLock singletonNoLock = (SingletonNoLock) constructor.newInstance(null);
        Assert.assertFalse(singletonNoLock == SingletonNoLock.getInstance());
    }
}
