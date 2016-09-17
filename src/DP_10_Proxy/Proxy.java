package DP_10_Proxy;

/**
 * Created by wuwg on 2016/8/30.
 */
public class Proxy implements Sourceable {
    private Source source;
    public Proxy() {
        super();
        this. source =new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();

    }
    private void after() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
