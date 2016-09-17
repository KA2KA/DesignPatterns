package DP_01_FactoryMethod;

/**
 * 此为普通工厂方法
 * Created by wuwg on 2016/8/29.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("mail");
        sender.send();
    }
}
