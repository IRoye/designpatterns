package proxy.dynamicproxy;

public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println("做点事情！");
    }
}
