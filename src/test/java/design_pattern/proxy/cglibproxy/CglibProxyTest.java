package design_pattern.proxy.cglibproxy;

import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:23 9/8/18
 * @ModifiedBy:
 */
public class CglibProxyTest {
    @Test
    public void test() {
        CglibProxy cglibProxy = new CglibProxy(new ActorNoInterface());
        ActorNoInterface actor = (ActorNoInterface) cglibProxy.getInstance();
        actor.speak();
    }
}
