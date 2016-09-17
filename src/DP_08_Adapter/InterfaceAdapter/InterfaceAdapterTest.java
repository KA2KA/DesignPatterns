package DP_08_Adapter.InterfaceAdapter;

/**
 * Created by wuwg on 2016/8/30.
 */
public class InterfaceAdapterTest {

    public static void main(String[] args) {
        Targetable target = new InterfaceAdapter1();
        target.method1();
        target.method2();
        System.out.println("---------------");
        Targetable  target2 = new InterfaceAdapter2();
        target2.method1();
        target2.method2();
    }
}

