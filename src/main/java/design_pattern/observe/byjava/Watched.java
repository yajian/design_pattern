package design_pattern.observe.byjava;

import java.util.Observable;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:25 23/8/18
 * @ModifiedBy:
 */
public class Watched extends Observable {

    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }

}
