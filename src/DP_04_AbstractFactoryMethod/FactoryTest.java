package DP_04_AbstractFactoryMethod;



/**
 * 此为抽象工厂模式
 * Created by wuwg on 2016/8/29.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
