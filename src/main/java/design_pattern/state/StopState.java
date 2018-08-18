package design_pattern.state;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午5:10 18/8/18
 * @ModifiedBy:
 */
public class StopState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
