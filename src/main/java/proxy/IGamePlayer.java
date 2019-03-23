package proxy;

/***
 * 抽象主题角色，定义业务
 */
public interface IGamePlayer {

    public void login(String username, String password);

    public void start();

    public void play();

    public void end();
}
