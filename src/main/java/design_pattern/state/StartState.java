package design_pattern.state;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午5:08 18/8/18
 * @ModifiedBy:
 */
public class StartState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
