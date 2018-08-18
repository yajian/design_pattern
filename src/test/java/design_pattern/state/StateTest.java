package design_pattern.state;

import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午5:11 18/8/18
 * @ModifiedBy:
 */
public class StateTest {


    @Test
    public void test() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.handle(context);

        StopState stopState = new StopState();
        stopState.handle(context);


    }
}
