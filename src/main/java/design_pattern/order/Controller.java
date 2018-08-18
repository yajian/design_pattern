package design_pattern.order;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午12:37 18/8/18
 * @ModifiedBy:
 */
public class Controller {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonOnPressed() {
        command.execute();
    }


}
