package DP_09_Decorator;

/**
 * 装饰设计模式：包装具有相同父类和接口的类.利用组合.然后重写相关的方法。
 * 示例：java.io里面就是装饰器模式的.
 * 把要装饰的类扔给装饰类，通过装饰类来实现功能。
 * Created by wuwg on 2016/8/30.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
