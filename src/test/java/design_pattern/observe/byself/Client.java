package design_pattern.observe.byself;

import design_pattern.observe.byself.ConcreteObserver;
import design_pattern.observe.byself.ConcreteSubject;
import design_pattern.observe.byself.Observer;
import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:13 23/8/18
 * @ModifiedBy:
 */
public class Client {

    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change("new state");
    }
}
