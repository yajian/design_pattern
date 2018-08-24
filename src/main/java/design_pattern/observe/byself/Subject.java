package design_pattern.observe.byself;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午8:07 23/8/18
 * @ModifiedBy:
 */
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("add an observer");
    }

    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("remove an observer");
    }

    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }

}
