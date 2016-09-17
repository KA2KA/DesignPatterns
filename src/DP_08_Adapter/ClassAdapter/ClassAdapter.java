package DP_08_Adapter.ClassAdapter;

/**
 * Created by wuwg on 2016/8/30.
 */
public class ClassAdapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }
}
