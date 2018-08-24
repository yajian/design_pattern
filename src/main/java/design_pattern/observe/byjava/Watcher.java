package design_pattern.observe.byjava;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:27 23/8/18
 * @ModifiedBy:
 */
public class Watcher implements Observer {

    public Watcher(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生变化：" + ((Watched) o).getData());
    }

}
