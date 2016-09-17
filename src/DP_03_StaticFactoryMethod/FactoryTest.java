package DP_03_StaticFactoryMethod;


import DP_02_FactoryMethod.Sender;

/**
 * 此为静态工厂方法模式
 * Created by wuwg on 2016/8/29.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = DP_03_StaticFactoryMethod.SenderFactory.produceMail();
        sender.send();
        System.out.println("----------");
        sender = DP_03_StaticFactoryMethod.SenderFactory.produceSms();
        sender.send();

    }
}
