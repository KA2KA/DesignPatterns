package DP_01_FactoryMethod;

/**
 * Created by wuwg on 2016/8/29.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
