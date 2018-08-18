package design_pattern.proxy.cglibproxy;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:20 9/8/18
 * @ModifiedBy:
 */
public class CglibProxy implements MethodInterceptor {

    private Object actor;

    public CglibProxy(ActorNoInterface actor) {
        this.actor = actor;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("进入cglib代理");
        methodProxy.invokeSuper(o, objects);
        System.out.println("退出cglib代理");
        return null;
    }

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.actor.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
