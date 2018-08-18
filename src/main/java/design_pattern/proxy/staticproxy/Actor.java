package design_pattern.proxy.staticproxy;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:00 9/8/18
 * @ModifiedBy:
 */
public class Actor implements Person {

    @Override
    public void speak() {
        System.out.println("这是actor");
    }
}
