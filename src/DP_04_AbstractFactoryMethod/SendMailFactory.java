package DP_04_AbstractFactoryMethod;

/**
 * Created by wuwg on 2016/8/29.
 */
public class SendMailFactory implements  Provider {
    @Override
    public Sender produce() {
    return  new MailSender();
    }
}
