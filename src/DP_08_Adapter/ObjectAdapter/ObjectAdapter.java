package DP_08_Adapter.ObjectAdapter;

/**
 * Created by wuwg on 2016/8/30.
 */
public class ObjectAdapter implements Targetable {
    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }
}
