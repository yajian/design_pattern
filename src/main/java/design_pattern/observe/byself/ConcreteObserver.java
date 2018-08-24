package design_pattern.observe.byself;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:12 23/8/18
 * @ModifiedBy:
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        observerState = state;
        System.out.println("状态为：" + state);
    }
}
