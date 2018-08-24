package design_pattern.observe.byjava;

import org.junit.Test;

import java.util.Observer;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:29 23/8/18
 * @ModifiedBy:
 */
public class ObserveTest {
    @Test
    public void test() {
        Watched watched = new Watched();
        Observer observer = new Watcher(watched);
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }
}
