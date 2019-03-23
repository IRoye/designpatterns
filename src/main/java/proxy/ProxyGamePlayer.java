package proxy;

/**
 * 为GamePlayer对象提供一个代理，用于控制对于这个对象的访问。
 * 访问控制
 * 角色是代理主题
 */
public class ProxyGamePlayer implements IGamePlayer {

    // 需要代理的实现类
    private IGamePlayer gamePlayer = null;

    public ProxyGamePlayer(String name) {
        gamePlayer = new GamePlayer(this, name);
    }

    public void login(String username, String password) {
        gamePlayer.login(username, password);
    }

    public void start() {
        gamePlayer.start();
    }

    public void play() {
        gamePlayer.play();
    }

    public void end() {
        gamePlayer.end();
    }

    /**
     * 感觉代理真正的好处是在这里的，有关real Subject 的逻辑自己实现
     * 除此之外，before(), after()这类的事情交给代理来实现。real Suject 只关心最重要的逻辑
     * 引申一些就是spring AOP
     * 其他的比如消息预处理、活驴消息、消息转发、事后处理消息等功能。
     */

    public void before() {
        System.out.println("事前处理一些事情");
    }

    public void after() {
        System.out.println("事后处理一些事情");
    }
}
