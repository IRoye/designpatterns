package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;

public class Client {

    public static void main(String[] args) {
        // 主题
        Subject subject = new RealSubject();
        // handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

        proxy.doSomething();
    }
}
