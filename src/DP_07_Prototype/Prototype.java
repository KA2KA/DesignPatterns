package DP_07_Prototype;

/**
 * 原型设计模式
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 * 总结：简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * Created by wuwg on 2016/8/30.
 */
public class Prototype implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
