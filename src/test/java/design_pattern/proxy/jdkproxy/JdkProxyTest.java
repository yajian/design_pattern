package design_pattern.proxy.jdkproxy;


import design_pattern.proxy.staticproxy.Actor;
import design_pattern.proxy.staticproxy.Person;
import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:06 9/8/18
 * @ModifiedBy:
 */
public class JdkProxyTest {

    @Test
    public void test() {
        Actor actor = new Actor();
        JdkProxy jdkProxy = new JdkProxy(actor);
        Person proxy = (Person) jdkProxy.getProxy();
        proxy.speak();
    }


}
