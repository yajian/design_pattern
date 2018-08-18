package design_pattern.proxy.jdkproxy;

import design_pattern.proxy.staticproxy.Actor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：huangyajian
 * @Description:
 * @Date: Create in 下午6:04 9/8/18
 * @ModifiedBy:
 */
public class JdkProxy implements InvocationHandler {

    private Actor actor;

    public JdkProxy(Actor actor) {
        this.actor = actor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理");
        method.invoke(actor, args);
        System.out.println("退出代理");
        return null;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), this.actor.getClass().getInterfaces(), this);
    }
}
