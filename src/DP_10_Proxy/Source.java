package DP_10_Proxy;

/**
 * Created by wuwg on 2016/8/30.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
