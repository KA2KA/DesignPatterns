package DP_04_AbstractFactoryMethod;

/**
 * Created by wuwg on 2016/8/29.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
