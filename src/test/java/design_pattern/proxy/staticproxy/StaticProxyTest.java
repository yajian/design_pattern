package design_pattern.proxy.staticproxy;

import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:02 9/8/18
 * @ModifiedBy:
 */
public class StaticProxyTest {
    @Test
    public void test() {
        Actor actor = new Actor();
        Agent agent = new Agent(actor);
        agent.speak();
    }
}
