package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        // 对于普通代理来说，客户端不能访问真实的角色，只能访问代理角色
        // 那么就只能是在代理角色的构造函数中构造真实角色
        // IGamePlayer gamePlayer = new GamePlayer();
        // 此时，调用者只知道代理不知道真实角色，无论真实角色如何修改，都不会影响到代理角色的代码
//        IGamePlayer proxyGamePlayer = new ProxyGamePlayer("小明");
//        proxyGamePlayer.login("123", "123");
//        proxyGamePlayer.start();
//        proxyGamePlayer.play();
//        proxyGamePlayer.end();

        // 动态代理部分
        IGamePlayer gamePlayer = new GamePlayer("小明");
        InvocationHandler handler = new GamePlayerIH(gamePlayer);

        ClassLoader cl = gamePlayer.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.play();
    }
}
