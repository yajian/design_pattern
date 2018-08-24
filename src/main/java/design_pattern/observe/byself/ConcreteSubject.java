package design_pattern.observe.byself;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:10 23/8/18
 * @ModifiedBy:
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        this.notifyObservers(newState);
    }
}
