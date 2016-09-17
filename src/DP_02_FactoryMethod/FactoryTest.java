package DP_02_FactoryMethod;



/**
 * 此为多个工厂方法模式
 * Created by wuwg on 2016/8/29.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produceMail();
        sender.send();
        System.out.println("----------");
        Sender sender1 = senderFactory.produceSms();
        sender1.send();

    }
}
