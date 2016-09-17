package DP_08_Adapter.ClassAdapter;

/**
 * 类的适配器：通过一个适配器继承一个类的方法和实现另一个接口，将两者联系拼接在一起。（保证方法名相同）
 * Created by wuwg on 2016/8/30.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable targetable = new ClassAdapter();
        targetable.method1();
        targetable.method2();
    }

}
