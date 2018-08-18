package design_pattern.order;

import org.junit.Test;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午12:41 18/8/18
 * @ModifiedBy:
 */
public class OrderTest {


    @Test
    public void test() {
        Controller controller = new Controller();
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        controller.setCommand(lightOffCommand);
        controller.buttonOnPressed();
        controller.setCommand(lightOnCommand);
        controller.buttonOnPressed();
    }
}
