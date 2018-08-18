package design_pattern.proxy.staticproxy;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:00 9/8/18
 * @ModifiedBy:
 */
public class Agent implements Person {

    private Actor actor;

    public Agent(Actor actor) {
        this.actor = actor;
    }

    @Override
    public void speak() {
        System.out.println("进入代理");
        actor.speak();
        System.out.println("退出代理");
    }
}
