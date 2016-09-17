package DP_09_Decorator;

/**
 * Created by wuwg on 2016/8/30.
 */
public class Decorator implements Sourceable {

    private  Sourceable source;
    public Decorator(Sourceable source){
        this.source =source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
