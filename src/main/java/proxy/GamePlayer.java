package proxy;

/***
 * 具体主题角色
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer, String name) {
        // 做一些限制，比如只能让代理类来 new Object
        if (gamePlayer == null) {
            throw new RuntimeException("不能创建");
        } else {
            this.name = name;
        }
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String username, String password) {
        System.out.println("suername: " + username + " password:" + password);
    }

    public void start() {
        System.out.println(this.name + " start");
    }

    public void play() {
        System.out.println("play");
    }

    public void end() {
        System.out.println("end");
    }
}
