package design_pattern.state;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午5:07 18/8/18
 * @ModifiedBy:
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
