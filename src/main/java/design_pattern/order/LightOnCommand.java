package design_pattern.order;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午12:35 18/8/18
 * @ModifiedBy:
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
