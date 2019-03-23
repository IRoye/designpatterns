package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 就是产生一个代理对象
 * 这个和之前的区别就是，不用去实现业务逻辑接口，如果接口方法很多的话，普通代理维护会特别的麻烦
 *
 */
public class GamePlayerIH implements InvocationHandler {

    // 被代理class
    Class cls = null;

    // 被代理的obj
    Object obj = null;

    // 需要代理的对象
    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj, args);
    }
}
