package DP_10_Proxy;

import java.io.File;

/**
 * 代理模式：為其它的物件提供一種代理，以控制對這個物件的訪問。
 * Spring中的代理就是代理模式的运用，通过代理模式进行横切。
 * Created by wuwg on 2016/8/30.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
