package design_pattern.order;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午12:36 18/8/18
 * @ModifiedBy:
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
